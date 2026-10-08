import java.util.Deque;
import java.util.ArrayDeque;

public class DequeOperations {

    public static void main(String[] args) {
        // Create a Deque
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println("--- Executing Deque Operations ---");

        // insertRear(10) -> In Java, this is addLast()
        deque.addLast(10);
        System.out.println("insertRear(10)  -> State: " + deque);

        // insertRear(20)
        deque.addLast(20);
        System.out.println("insertRear(20)  -> State: " + deque);

        // insertFront(5) -> In Java, this is addFirst()
        deque.addFirst(5);
        System.out.println("insertFront(5)  -> State: " + deque);

        // deleteRear() -> In Java, this is removeLast()
        int deleted = deque.removeLast();
        System.out.println("deleteRear()    -> Removed: " + deleted + " | State: " + deque);

        // insertFront(2)
        deque.addFirst(2);
        System.out.println("insertFront(2)  -> State: " + deque);

        // Display the final deque
        System.out.println("\nFinal Deque Output: " + deque);
    }
}
