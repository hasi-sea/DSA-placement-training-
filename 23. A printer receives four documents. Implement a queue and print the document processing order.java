import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueueSimulation {

    public static void main(String[] args) {
        // Implement a queue using LinkedList to store documents
        Queue<String> printerQueue = new LinkedList<>();

        // The printer receives four documents
        printerQueue.add("Document_A.pdf");
        printerQueue.add("Document_B.docx");
        printerQueue.add("Document_C.txt");
        printerQueue.add("Document_D.xlsx");

        System.out.println("Documents waiting in the print queue: " + printerQueue);
        System.out.println("\n--- Starting Print Job ---\n");

        // Process and print the document order (FIFO)
        int order = 1;
        while (!printerQueue.isEmpty()) {
            // poll() retrieves and removes the head (front) of the queue
            String currentDocument = printerQueue.poll();
            System.out.println("Processing #" + order + ": Printing " + currentDocument + "...");
            order++;
        }
        
        System.out.println("\nAll documents have been successfully printed.");
    }
}
