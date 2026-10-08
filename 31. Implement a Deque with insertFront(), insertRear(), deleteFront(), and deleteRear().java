public class CustomDeque {
    private int[] deque;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the Deque
    public CustomDeque(int size) {
        this.capacity = size;
        this.deque = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    // Check if the deque is full
    public boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // 1. Insert an element at the front
    public void insertFront(int key) {
        if (isFull()) {
            System.out.println("Deque Overflow! Cannot insert " + key + " at front.");
            return;
        }
        
        // If empty, initialize both pointers
        if (front == -1) {
            front = 0;
            rear = 0;
        } 
        // Wrap around if front is at the beginning
        else if (front == 0) {
            front = capacity - 1;
        } 
        // Otherwise, simply decrement front
        else {
            front--;
        }
        
        deque[front] = key;
        System.out.println("Inserted " + key + " at front.");
    }

    // 2. Insert an element at the rear
    public void insertRear(int key) {
        if (isFull()) {
            System.out.println("Deque Overflow! Cannot insert " + key
