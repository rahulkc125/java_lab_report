// Grandparent class
class Vehicle {
    void start() {
        System.out.println("The vehicle starts.");
    }
}

// Parent class inherits from Vehicle
class Car extends Vehicle {
    void honk() {
        System.out.println("The car honks.");
    }
}

// Child class inherits from Car
class SportsCar extends Car {
    void speed() {
        System.out.println("The sports car speeds up.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar();

        // Calling methods from all levels
        mySportsCar.start();  // From Vehicle class
        mySportsCar.honk();   // From Car class
        mySportsCar.speed();  // From SportsCar class
    }
}
