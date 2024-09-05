class Car {
    String model;
    String color;
    int year;

    void start() {
        System.out.println(model + " is starting.");
    }

    void drive() {
        System.out.println(model + " is driving.");
    }
}

public class Model {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Tesla Model S";
        car1.color = "Red";
        car1.year = 2023;

        car1.start();
        car1.drive();

        Car car2 = new Car();
        car2.model = "Ford Mustang";
        car2.color = "Blue";
        car2.year = 2022;

        car2.start();
        car2.drive();
    }
}
