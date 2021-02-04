package company2;

public abstract class Vehicle {

    private String make;

    Vehicle(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public abstract void fillUp();
}
