public class Menu {
    //Code by Timmie & Jacob - start

    //Method returns an element of an int array, which holds pizza id values
    public static int[] getPizzaID() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    //Method returns an element of an int array, which holds pizza price values
    public static int[] getPizzaPrice() {
        return new int[]{57, 53, 57, 63, 65, 57, 61, 61, 61, 61};
    }

    //Method returns an element of a String array, which holds pizza names
    public static String[] getPizzaName() {
        return new String[]{"Vesuvio", "Amerikaner", "Cacciatore", "Carbona", "Dennis",
                "Bertil", "Silvia", "Victoria", "Toronfo", "Capricciosa"};
    }
    //Method returns an element of a String array, which holds pizza ingredients
    public static String[] getPizzaIngredient() {
        return new String[]{"tomatsauce, ost, skinke, oregano","tomatsauce, ost, oksefars og oregano",
                "tomatsauce, ost, pepperoni og oregano", "tomatsauce, ost, kødsovs, spaghetti, cocktailpølser og oregano",
                "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", "tomatsauce, ost, bacon og oregano",
                "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano",
                "tomatsauce, ost, skinke, bacon, kebab, chili og oregano", "tomatsauce, ost, skinke, champignon og oregano"};
    }


    public static Pizza getPizzaNumber(int pizzaNumber) {
        //Based upon the value of pizzaNumber, an object of type Pizza is created with matching attributes, and is then returned to whichever place it was called
        return new Pizza(getPizzaID()[pizzaNumber-1], getPizzaPrice()[pizzaNumber-1], getPizzaName()[pizzaNumber-1], getPizzaIngredient()[pizzaNumber-1]);
    }
    //Code by Timmie & Jacob - end
}






