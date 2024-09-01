// Create a Vehicle Class Hierarchy: 
//    - Design a base class `Vehicle` with attributes like `make`, `model`, and `year`. 
//    - Create derived classes `Car` and `Motorcycle` that inherit from `Vehicle`.
//    - Add specific attributes to each subclass, such as `numberOfDoors` for `Car` and `hasSidecar` for `Motorcycle`.
//    - Implement methods to display the details of each vehicle.

class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    void display() {
        super.display();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    void display() {
        super.display();
        System.out.println("Has sidecar: " + hasSidecar);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        car.display();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, true);
        motorcycle.display();
    }
}