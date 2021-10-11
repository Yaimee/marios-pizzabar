public class Menu {
    //Code by Timmie
    private int[] pizzaPrices;
    private String[] pizzaName;
    private String[] pizzaIngredients;


    public Menu(int[] pizzaPrices, String[] pizzaName) {
        this.pizzaPrices = pizzaPrices;
        this.pizzaName = pizzaName;
    }

    public int[] getPizzaPrice() {
        return pizzaPrices;
    }
    public void setPizzaPrice(int[] pizzaPrice) {
        this.pizzaPrices = pizzaPrice;
    }
    public String[] getPizzaName() {
        return pizzaName;
    }
    public void setPizzaName(String[] pizzaName) {
        this.pizzaName = pizzaName;
    }
    public String[] getPizzaIngredients() {
        return pizzaIngredients;
    }
    public void setPizzaIngredients(String[] pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public getPizza(Pizza pizzaID) {
        Pizza pizza1 = new Pizza(1,57, "Vesuvio");
        Pizza pizza2 = new Pizza(2,53, "Amerikaner");
        Pizza pizza3 = new Pizza(3,57, "Cacciatore");
        Pizza pizza4 = new Pizza(4,63, "Carbona");
        Pizza pizza5 = new Pizza(5,65, "Dennis");
        Pizza pizza6 = new Pizza(6,57, "Bertil");
        Pizza pizza7 = new Pizza(7,61, "Silvia");
        Pizza pizza8 = new Pizza(8,61, "Victoria");
        Pizza pizza9 = new Pizza(9,61, "Toronfo");
        Pizza pizza10 = new Pizza(10,61, "Capricciosa");


    }
}






