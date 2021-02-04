package company2;

public class Airplane extends Vehicle implements Flying {

    Airplane(String make) {
        super(make);
    }

    @Override
    public void fillUp() {
        System.out.println("Самолёт " + getMake() + " успешно заправлен и готов к полёту.");
    }

    @Override
    public void fly() {
        System.out.println("Самолёт " + getMake() + " летит!");
    }
}
