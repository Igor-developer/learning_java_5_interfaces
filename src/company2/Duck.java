package company2;

public class Duck extends Bird implements Flying {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Утка " + getName() + " накормлена зерном и готова к предстоящему полёту.");
    }

    @Override
    public void fly() {
        System.out.println("Утка " + getName() + " летит!");
    }
}
