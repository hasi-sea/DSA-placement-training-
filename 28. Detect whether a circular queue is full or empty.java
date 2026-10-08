public class CircularQueueDetector {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public CircularQueueDetector(int size) {
        this.capacity = size;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    // 1. Detect whether the circular queue is EMPTY
    public boolean isEmpty() {
        // The queue is empty if the front pointer is at its initialized state (-1)
        return front == -1;
    }

    // 2. Detect whether the circular queue is FULL
    public boolean isFull() {
        // A circular queue is full when the next position for the rear pointer 
        // wraps around and hits the front pointer.
        
        // Method A: Using modulo arithmetic
        // return (rear + 1) % capacity == front;

        // Method B: Explicit condition checks
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    // Helper method to add an element for testing
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue.");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        System.out.println("Enqueued: " + item);
    }

    public static void main(String[] args) {
        CircularQueueDetector cq = new CircularQueueDetector(3);

        System.out.println("Initial state:");
        System.out.println("Is empty? " + cq.isEmpty());
        System.out.println("Is full? " + cq.isFull());

        System.out.println("\nAdding 3 elements...");
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);

        System.out.println("\nState after filling the queue:");
        System.out.println("Is empty? " + cq.isEmpty());
        System.out.println("Is full? " + cq.isFull());
    }
}
