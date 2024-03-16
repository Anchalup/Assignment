// THIS IS FOR CLASS AND OBJECT
class Car {
    // Class variables (also known as fields or attributes)
    String make;
    String model;
    int year;

    // Constructor method
    public Car(String make, String model, int year) {
        // Initializing object variables using constructor parameters
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Accessing object methods
        myCar.displayInfo();
    }
}
