public class CPUTaskQueue {
    private String[] tasks;
    private int front;
    private int rear;
    private int capacity;
    private int currentSize;

    // Initialize the CPU task queue
    public CPUTaskQueue(int size) {
        this.capacity = size;
        this.tasks = new String[capacity];
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

    // Add a new task to the CPU queue
    public void addTask(String taskName) {
        if (isFull()) {
            System.out.println("CPU Queue Overload! Cannot add " + taskName);
            return;
        }
        
        // Modulo arithmetic ensures the rear pointer wraps around to reuse empty slots
        rear = (rear + 1) % capacity;
        tasks[rear] = taskName;
        currentSize++;
        System.out.println("Added: " + taskName + " [Assigned to Slot " + rear + "]");
    }

    // Execute and remove the next task in the queue
    public String executeTask() {
        if (isEmpty()) {
            System.out.println("CPU is idle. No tasks to execute.");
            return null;
        }
        
        String completedTask = tasks[front];
        System.out.println("Executed: " + completedTask + " [Slot " + front + " is now free for reuse]");
        
        // Modulo arithmetic wraps the front pointer around the array
        front = (front + 1) % capacity;
        currentSize--;
        
        return completedTask;
    }

    // Display pending tasks
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("CPU Queue is empty.");
            return;
        }
        
        System.out.print("Pending Tasks: ");
        int count = 0;
        int i = front;
        while (count < currentSize) {
            System.out.print(tasks[i] + " ");
            i = (i + 1) % capacity
