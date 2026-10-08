public class CircularQueueModulo {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int currentSize;

    public CircularQueueModulo(int size) {
        this.capacity = size;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public boolean isFull() {
        return currentSize == capacity;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Enqueue operation demonstrating rear movement
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + item);
            return;
        }
        
        // ** MODULO ARITHMETIC FOR REAR MOVEMENT **
        // If rear reaches the end of the array (capacity - 1), 
        // adding 1 and applying modulo capacity wraps it back to 0.
        rear = (rear + 1) % capacity;
        
        queue[rear] = item;
        currentSize++;
        System.out.println("Enqueued: " + item + " | New Rear Position: " + rear);
    }

    // Dequeue operation demonstrating front movement
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        
        int item = queue[front];
        
        // ** MODULO ARITHMETIC FOR FRONT MOVEMENT **
        // If front reaches the end of the array (capacity - 1), 
        // adding 1 and applying modulo capacity wraps it back to 0.
        front = (front + 1) % capacity;
        
        currentSize--;
        System.out.println("Dequeued: " + item + " | New Front Position: " + front);
        return item;
    }

    public static void main(String[] args) {
        // Create a circular queue of size 3
        CircularQueueModulo cq = new CircularQueueModulo(3);

        System.out.println("--- Initial Enqueue ---");
        cq.enqueue(10); // Rear ends at index 0
        cq.enqueue(20); // Rear ends at index 1
        cq.enqueue(30); // Rear ends
