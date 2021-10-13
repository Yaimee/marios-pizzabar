//The class that is suppose to give back the information of every pizzas name, price and ID
public class Menu {
    //Code by Timmie & Jacob - start

    //Adds the ID of every Pizza via an array
    public static int[] getPizzaID() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    //Adds the prices for every pizza via an array
    public static int[] getPizzaPrices() {
        return new int[]{57, 53, 57, 63, 65, 57, 61, 61, 61, 61};
    }

    //Adds every pizza name via an array
    public static String[] getPizzaName() {
        return new String[]{"Vesuvio", "Amerikaner", "Cacciatore", "Carbona", "Dennis",
                "Bertil", "Silvia", "Victoria", "Toronfo", "Capricciosa"};
    }

    public static Pizza getPizzaNumber(int pizzaNumber) {

        //We combine all the earlier arrays to show information for every pizza in one line, when shown in the console
        //And since array index starts at 0, do we have to minus our arrays with one, so it lines up to every pizza
        return new Pizza(getPizzaID()[pizzaNumber-1], getPizzaPrices()[pizzaNumber-1], getPizzaName()[pizzaNumber-1]);
    }
    //Code by Timmie & Jacob - end
}






