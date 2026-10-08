import java.util.Deque;
import java.util.ArrayDeque;

public class CustomerRequestDeque {
    private Deque<String> requestQueue;

    public CustomerRequestDeque() {
        // ArrayDeque is an efficient implementation of the Deque interface
        this.requestQueue = new ArrayDeque<>();
    }

    // Urgent requests jump to the front of the line
    public void addUrgentRequest(String request) {
        requestQueue.addFirst("[URGENT] " + request);
        System.out.println("Added to front: " + request);
    }

    // Normal requests go to the back of the line
    public void addNormalRequest(String request) {
        requestQueue.addLast("[NORMAL] " + request);
        System.out.println("Added to rear: " + request);
    }

    // Always process from the front to ensure urgent items are handled first
    public void processNextRequest() {
        if (requestQueue.isEmpty()) {
            System.out.println("No pending requests.");
            return;
        }
        
        String nextToProcess = requestQueue.removeFirst();
        System.out.println("Processing: " + nextToProcess);
    }

    public void displayQueue() {
        if (requestQueue.isEmpty()) {
            System.out.println("The queue is currently empty.");
            return;
        }
        System.out.println("Current Queue (Next to Process -> Last):");
        System.out.println(requestQueue);
    }

    public static void main(String[] args) {
        CustomerRequestDeque serviceQueue = new CustomerRequestDeque();

        System.out.println("--- Incoming Requests ---");
        serviceQueue.addNormalRequest("Password Reset");
        serviceQueue.addNormalRequest("Update Billing Address");
        
        // Urgent requests arrive and jump the queue
        serviceQueue.addUrgentRequest("Server Outage");
        serviceQueue.addUrgentRequest("Account Compromised");

        System.out.println("\n--- Current Status ---");
        serviceQueue.displayQueue();

        System.out.println("\n--- Processing ---");
