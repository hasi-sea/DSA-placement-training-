import java.util.Stack;

public class PlateCounter {
    public static void main(String[] args) {
        // Create a stack to represent the plate counter
        Stack<String> plates = new Stack<>();

        // Plates are placed in the order A, B, C, D
        plates.push("A");
        plates.push("B");
        plates.push("C");
        plates.push("D");

        System.out.println("Plates placed on the counter (Bottom to Top): " + plates);
        System.out.print("Removal Order (LIFO): ");

        // Remove plates using LIFO (Last-In-First-Out)
        while (!plates.isEmpty()) {
            System.out.print(plates.pop());
            if (!plates.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
