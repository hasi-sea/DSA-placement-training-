import java.util.Stack;

public class BrowserHistory {
    private Stack<String> historyStack;
    private String currentPage;

    public BrowserHistory() {
        historyStack = new Stack<>();
        currentPage = "Home Page"; // Default starting page
        System.out.println("Browser opened at: " + currentPage);
    }

    // Method to visit a new URL
    public void visit(String url) {
        // Push the current page to the history stack before moving to the new one
        historyStack.push(currentPage);
        currentPage = url;
        System.out.println("\nVisited: " + url);
    }

    // Method to implement 'Back' functionality
    public void back() {
        System.out.println("\n--- Clicking 'Back' Button ---");
        if (historyStack.isEmpty()) {
            System.out.println("Cannot go back. History is empty.");
        } else {
            // Pop the most recent page from the stack (LIFO)
            String previousPage = historyStack.pop();
            System.out.println("Leaving: " + currentPage);
            currentPage = previousPage;
            System.out.println("Returned to: " + currentPage);
        }
    }

    // Method to display the current state
    public void displayCurrentState() {
        System.out.println("Current Page: " + currentPage);
        System.out.println("History Stack (Bottom to Top): " + historyStack);
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        
        // Simulating user browsing
        browser.visit("google.com");
        browser.visit("github.com/haashim");
        browser.visit("stackoverflow.com");
        
        System.out.println("\n--- State before pressing Back ---");
        browser.displayCurrentState();
        
        // Simulating pressing the 'Back' button
        browser.back();
        browser.displayCurrentState();
        
        browser.back();
        browser.displayCurrentState();
        
        // Trying to go back when only the Home Page is left
        browser.back();
        browser.back(); 
    }
}
