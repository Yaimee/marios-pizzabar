public class Menu {
    //Code by Timmie
    private int[] pizzaPrices;
    private String[] pizzaName;
    private String[] pizzaIngredients;
    private int pizzaID;

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
}






