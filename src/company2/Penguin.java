package company2;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Пингвин " + getName() + " накормлен рыбой и прекрасно себя чувствует.");
    }
}
