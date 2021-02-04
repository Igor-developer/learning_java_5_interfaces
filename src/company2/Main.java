package company2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        runTask2();
        runTask3();
    }

    //Задание 2.
    //Создать новый проект. В него добавить класс Птица, Уточка, Пингвин, Самолет, Транспотное средство, Самокат.
    //Добавить интерфейс Летающее. В нем должен быть метод летать.
    //Устроить правильную иерархию между всеми добавленными классами.
    //Реализовать все абстрактные методы и интерфейсы понятное дело =)
    //Устроить гонки между всеми летающими.
    private static void runTask2() {
        Airplane airplane = new Airplane("Boeing 737");
        Duck duck = new Duck("Даффи Дак");

        airplane.fillUp();
        duck.feed();
        System.out.println();

        airplane.fly();
        duck.fly();
    }

    //Задание 3.
    //Петя, Катя и Сережа делают из бумаги журавликов. Вместе они сделали S журавликов.
    //Сколько журавликов сделал каждый ребенок, если известно,
    //что Петя и Сережа сделали одинаковое количество журавликов,
    //а Катя сделала в два раза больше журавликов, чем Петя и Сережа вместе?
    private static void runTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько журавликов Петя, Катя и Серёжа сделали совместно и нажмите Enter:");
        int s = Integer.parseInt(scanner.nextLine());

        int peter = (int) (s / 6.0);     //решение уравнения 4x + x + x = s;
        int sergey = peter;
        int catherine = (int) (4 * (s / 6.0));
        int rest = s - peter - sergey - catherine;

        System.out.println(
                "Петя сделал  журавликов - " + (rest == 0 ? "" : "как минимум ") + peter + ";\n" +
                        "Катя сделала журавликов - " + (rest == 0 ? "" : "как минимум ") + catherine + ";\n" +
                        "Петя сделал  журавликов - " + (rest == 0 ? "" : "как минимум ") + sergey + "" +
                        (rest == 0 ? "." : ";\nкто сделал остальные " + rest + " журавликов точно установить не удалось.")
        );
    }

}