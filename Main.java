// Base class
class Vehicle {
    // Method to be overridden
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass
class Car extends Vehicle {
    // Overriding the drive method
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.drive();  // Output: Driving a vehicle

        Car myCar = new Car();
        myCar.drive();      // Output: Repairing a car
}
}