public class CustomQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int currentSize;

    // Constructor to initialize the queue
    public CustomQueue(int size) {
        this.capacity = size;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    // Helper method to check if the queue is empty
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Method to add an item to the queue
    public void enqueue(int item) {
        if (currentSize == capacity) {
            System.out.println("Queue Overflow! Cannot add " + item);
            return;
        }
        rear = (rear + 1) % capacity; 
        queue[rear] = item;
        currentSize++;
        System.out.println("Enqueued: " + item);
    }

    // Method to remove an item from the queue
    public int dequeue() {
        // EXPLICIT UNDERFLOW HANDLING
        if (isEmpty()) {
            System.out.println("Queue Underflow Error! Cannot dequeue from an empty queue.");
            return -1; // Return a sentinel value to indicate failure
        }
        
        int item = queue[front];
        front = (front + 1) % capacity;
        currentSize--;
        return item;
    }

    // Method to get the front item of the queue
    public int peek() {
        // EXPLICIT UNDERFLOW HANDLING
        if (isEmpty()) {
            System.out.println("Queue Underflow Error! Cannot peek an empty queue.");
            return -1; // Return a sentinel value to indicate failure
        }
        
        return queue[front];
    }

    public static void main(String[] args) {
        CustomQueue myQueue = new CustomQueue(3);

        System.out.println("--- Testing Underflow on Empty Queue ---");
        myQueue.dequeue(); 
        myQueue.peek();    

        System.out.println("\n--- Adding Elements ---");
        myQueue.enqueue(10);
        myQueue.enqueue(20);

        System.out.println("\n--- Removing Elements ---");
        System.out.println("Dequeued value: " + myQueue.dequeue());
        System.out.println("Dequeued value: " + myQueue.dequeue());

        System.out.println("\n--- Testing Underflow Again ---");
        myQueue.dequeue(); 
    }
}
