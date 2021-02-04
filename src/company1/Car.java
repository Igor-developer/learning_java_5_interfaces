package company1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Car extends Vehicle {

    public Car(String make) {
        super(make);
    }

    @Override
    public void fillFuel(double amount, String type) {
        amount = new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println("Автомобиль " + getMake() + " заправлен, топливо " + type + ", " + amount + " литров.");
    }

    @Override
    public void beep() {
        System.out.println("Бип, бип!");
    }
}
