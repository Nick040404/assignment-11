// vehicles/Car.java
package vehicles;

public class Car extends Vehicle {
    private int speed;

    public Car() {
        super("DefaultModel", "DefaultMake");
        this.speed = 0;
    }

    public Car(String model, String make, int speed) {
        super(model, make);
        this.speed = speed;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println("Car is accelerating. Speed: " + speed);
    }

    @Override
    public void brake() {
        speed -= 10;
        System.out.println("Car is braking. Speed: " + speed);
    }
}