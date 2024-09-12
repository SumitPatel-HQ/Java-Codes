class Animal {
    String name = "Generic Animal";

    Animal() {
        System.out.println("Animal Constructor");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super();
        System.out.println("Dog Constructor");
    }

    void sound() {
        super.sound();
        System.out.println("Dog barks");
        System.out.println("Animal name using super: " + super.name);
        System.out.println("Dog name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

/*
Output:
Animal Constructor
Dog Constructor
Animal makes sound
Dog barks
Animal name using super: Generic Animal
Dog name: Dog
*/
