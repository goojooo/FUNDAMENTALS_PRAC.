abstract class Animals {
    abstract void sound();
}

class Dog extends Animals {
    void sound() {
        System.out.println("Dog barks...");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animals a = new Dog(); // abstraction
        a.sound();
    }
}