import java.util.LinkedList;
import java.util.Queue;

public class BankQueueSimulation {

    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> bankQueue = new LinkedList<>();

        // Customers arrive at the bank
        bankQueue.add("A");
        bankQueue.add("B");
        bankQueue.add("C");
        bankQueue.add("D");
        
        System.out.println("Initial Queue: " + bankQueue);

        // Serve customers in FIFO order until 'B' is served
        while (!bankQueue.isEmpty()) {
            String currentCustomer = bankQueue.poll();
            System.out.println("Serving customer: " + currentCustomer);
            
            if (currentCustomer.equals("B")) {
                System.out.println("Customer B has been served.");
                break;
            }
        }

        // Display the final queue
        System.out.println("Queue after serving B: " + bankQueue);
    }
}
