class Animalss {
    void sound() {
        System.out.println("Animal sound...");
    }
}

class Cat extends Animalss {
    @Override
    void sound() {
        System.out.println("Cat meow...");
    }
}

public class Wild {
    public static void main(String[] args) {

        // Case 1: Parent reference, Parent object
        Animalss a1 = new Animalss();
        a1.sound();   // Animal sound...

        // Case 2: Child reference, Child object
        Cat c = new Cat();
        c.sound();    // Cat meow...

        // Case 3: Parent reference, Child object (Polymorphism)
        Animalss a2 = new Cat();
        a2.sound();   // Cat meow...
    }
}