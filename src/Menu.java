public class Menu {
    //Code by Timmie & Jacob - start

    public static int[] getPizzaID() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public static int[] getPizzaPrices() {
        return new int[]{57, 53, 57, 63, 65, 57, 61, 61, 61, 61};
    }

    public static String[] getPizzaName() {
        return new String[]{"Vesuvio", "Amerikaner", "Cacciatore", "Carbona", "Dennis",
                "Bertil", "Silvia", "Victoria", "Toronfo", "Capricciosa"};
    }


    public static Pizza getPizzaNumber(int pizzaNumber) {

        return new Pizza(getPizzaID()[pizzaNumber-1], getPizzaPrices()[pizzaNumber-1], getPizzaName()[pizzaNumber-1]);
    }
    //Code by Timmie & Jacob - end
}






