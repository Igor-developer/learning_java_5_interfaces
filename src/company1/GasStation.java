package company1;

public class GasStation {

    public static final int PETROL_A98      = 1;
    public static final int PETROL_A95_PLUS = 2;
    public static final int PETROL_A95      = 3;
    public static final int PETROL_A92      = 4;
    public static final int DIESEL          = 5;
    public static final int DIESEL_PLUS     = 6;
    public static final int GAZ             = 7;

    public static void fillVehicle(Vehicle vehicle, int fuel_type, double total_cost) {
        double cost = 0;
        String fuel_mark = null;
        switch (fuel_type) {
            case PETROL_A98:
                cost = 31.99;
                fuel_mark = "бензин A98";
                break;
            case PETROL_A95_PLUS:
                cost = 28.99;
                fuel_mark = "бензин A95+";
                break;
            case PETROL_A95:
                cost = 27.99;
                fuel_mark = "бензин A95";
                break;
            case PETROL_A92:
                cost = 26.99;
                fuel_mark = "бензин A92";
                break;
            case DIESEL:
                cost = 26.99;
                fuel_mark = "дизель";

                break;
            case DIESEL_PLUS:
                cost = 26.49 ;
                fuel_mark = "дизель+";
                break;
            case GAZ:
                cost = 13.48;
                fuel_mark = "газ";
                break;
        }

        if (cost == 0) {
            System.out.println("Неправильно выбран тип топлива!");
        } else {
            vehicle.fillFuel(total_cost / cost, fuel_mark);
        }
    }

}
