public class CircularQueueSimulation {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the circular queue
    public CircularQueueSimulation(int size) {
        this.capacity = size;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Insert an element into the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert " + item);
            return;
        }
        
        if (front == -1) {
            front = 0;
        }
        
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        System.out.println("Inserted: " + item);
    }

    // Delete an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot delete.");
            return -1;
        }
        
        int item = queue[front];
        
        // If there's only one element, reset queue to empty
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        
        System.out.println("Deleted: " + item);
        return item;
    }

    // Display the elements in the queue
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
        // Create a circular queue of size 5
        CircularQueueSimulation cq = new Circular
