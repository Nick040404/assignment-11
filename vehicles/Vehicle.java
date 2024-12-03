// vehicles/Vehicle.java
package vehicles;

import utilities.Driveable;

public abstract class Vehicle implements Driveable {
    protected String model;
    protected String make;

    public Vehicle() {
        this.model = "Generic";
        this.make = "Unknown";
    }

    public Vehicle(String model, String make) {
        this.model = model;
        this.make = make;
    }

    public abstract void startEngine();

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }
}