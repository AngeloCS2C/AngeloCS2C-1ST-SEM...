import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract void startEngine();

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
