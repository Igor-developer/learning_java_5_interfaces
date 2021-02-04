package company1;

public abstract class Vehicle implements IBeeper {

    private String make;

    public Vehicle(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public abstract void fillFuel(double amount, String type);
}
