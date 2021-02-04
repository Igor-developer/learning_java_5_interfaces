package company2;

public class PushCycle extends Vehicle {

    PushCycle(String make) {
        super(make);
    }

    @Override
    public void fillUp() {
        System.out.println("Самокат " + getMake() + " не требует заправки.");
    }
}
