import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class JavaQueueExample {

    public static void main(String[] args) {
        // Implementing a Queue using LinkedList
        // You can also use: Queue<String> queue = new ArrayDeque<>();
        Queue<String> queue = new LinkedList<>();

        // Enqueue: Adding elements to the queue
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");
        
        System.out.println("Initial Queue: " + queue);

        // Peek: Viewing the front element without removing it
        System.out.println("Front element (peek): " + queue.peek());

        // Dequeue: Removing and returning the front element
        String removedElement = queue.poll();
        System.out.println("Removed element (poll): " + removedElement);

        // Display the queue after dequeue
        System.out.println("Queue after dequeue: " + queue);
        
        // Checking if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
