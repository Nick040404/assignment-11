// vehicles/Bike.java
package vehicles;

public class Bike extends Vehicle {
    private boolean hasPedals;

    public Bike() {
        super("DefaultBikeModel", "DefaultBikeMake");
        this.hasPedals = true;
    }

    public Bike(String model, String make, boolean hasPedals) {
        super(model, make);
        this.hasPedals = hasPedals;
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bike is braking.");
    }
}