import java.util.Stack;

public class ParkingLotSimulation {
    public static void main(String[] args) {
        // Create a stack to represent the single-lane parking lot
        Stack<String> parkingLot = new Stack<>();

        System.out.println("--- Cars Entering the Parking Lot ---");
        
        // Simulating cars entering (Push operation)
        parkCar(parkingLot, "Car 1 (Toyota)");
        parkCar(parkingLot, "Car 2 (Honda)");
        parkCar(parkingLot, "Car 3 (Ford)");
        parkCar(parkingLot, "Car 4 (BMW)");

        System.out.println("\nCurrent Parking Lot state (Bottom to Top / First in to Last in): ");
        System.out.println(parkingLot);

        System.out.println("\n--- Cars Leaving the Parking Lot ---");
        
        // Simulating cars leaving (Pop operation - LIFO)
        leaveParkingLot(parkingLot);
        leaveParkingLot(parkingLot);

        System.out.println("\nRemaining Cars in the Parking Lot: ");
        System.out.println(parkingLot);
    }

    // Helper method to park a car
    public static void parkCar(Stack<String> lot, String carName) {
        lot.push(carName);
        System.out.println(carName + " has entered and parked.");
    }

    // Helper method to remove a car
    public static void leaveParkingLot(Stack<String> lot) {
        if (lot.isEmpty()) {
            System.out.println("The parking lot is empty. No cars to remove.");
        } else {
            String departingCar = lot.pop();
            System.out.println(departingCar + " has left the parking lot.");
        }
    }
}
