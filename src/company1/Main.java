package company1;

public class Main {

    public static void main(String[] args) {
        //Задание 1.
        //Повторить мои классы. Можно дополнить свои проекты с машиной.
        //Необходимо добавить класс Бензоколонка и интерфейс бибикающий.
        //Сделать правки в бензоколонку.
        //Добавить еще 1 параметр для приема: тип топлива и в зависимости от него брать разную цену.
        Car toyota = new Car("Toyota RAV4");

        GasStation.fillVehicle(toyota, GasStation.PETROL_A95, 480);

        beepSomeTimes(toyota);
    }

    private static void beepSomeTimes(IBeeper beeper){
        beeper.beep();
        beeper.beep();
    }

}