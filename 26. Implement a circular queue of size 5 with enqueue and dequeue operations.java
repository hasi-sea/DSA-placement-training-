public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the circular queue
    public CircularQueue(int size) {
        this.capacity = size;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    // Helper method to check if the queue is full
    public boolean isFull() {
        // Full if front is at 0 and rear is at the end, OR if front is just ahead of rear
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    // Helper method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + item);
            return;
        }
        
        // If queue is empty, set front to 0
        if (front == -1) {
            front = 0;
        }
        
        // Circularly increment rear
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        System.out.println("Enqueued: " + item);
    }

    // Method to remove an element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow Error! Cannot dequeue.");
            return -1;
        }
        
        int item = queue[front];
        
        // If there's only one element, reset the queue after removing it
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Circularly increment front
            front = (front + 1) % capacity;
        }
        
        return item;
    }

    // Method to display the queue contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        
        System.out.print("Current Queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println(queue[rear]);
    }

    public static void main(String[] args) {
        // Implement a circular queue of size 5
        CircularQueue cq = new CircularQueue(5);

        System.out.println("--- Enqueue Operations ---");
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        
        // Attempt to
