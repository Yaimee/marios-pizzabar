public class Menu {
    //Code by Timmie

    private int[] getPizzaID() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    private int[] getPizzaPrices() {
        return new int[]{57, 53, 57, 63, 65, 57, 61, 61, 61, 61};
    }

    private String[] getPizzaName() {
        return new String[]{"Vesuvio", "Amerikaner", "Cacciatore", "Carbona", "Dennis",
                "Bertil", "Silvia", "Victoria", "Toronfo", "Capricciosa"};
    }


    public Pizza getPizzaNumber(int pizzaNumber) {

        Pizza[] pizzaMenu = new Pizza[10];

        for (int i = 0; i < 9; i++) {
            pizzaMenu[i] = new Pizza(getPizzaID()[i], getPizzaPrices()[i], getPizzaName()[i]);
        }

        return pizzaMenu[pizzaNumber];

    }
}






