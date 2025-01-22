package Inheritance;
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create an object of the child class
        myDog.eat();           // Inherited method from the parent class
        myDog.bark();          // Method from the child class
    }
}
