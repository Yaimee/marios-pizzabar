public class Order {
    //code of Balthazar start
    private Pizza[] pizzas;
    private final int pickUpTime;
    private final int orderNr;
    private static Order[] activeOrders;
    private static Order[] completedOrders;

    //Constructor (utilized in class Main)
    public Order(Pizza[] pizzas, int pickUpTime, int orderNr) {
        this.pizzas = pizzas;
        this.pickUpTime = pickUpTime;
        this.orderNr = orderNr;
    }

    //method returns the activeOrders array
    public static Order[] getActiveOrders() {
        return activeOrders;
    }

    //method returns the pickupTime of an Order object
    public int getPickUpTime() {
        return pickUpTime;
    }

    //method returns the pizzas of an order object
    public Pizza[] getPizzas() {
        return pizzas;
    }

    //method returns the completedOrders array
    public static Order[] getCompletedOrders() {
        return completedOrders;
    }

    //makes a string of the pizzas using the .toSring method
    public String pizzasToString(Pizza[] pizzas) {
        String pizzasConcatinated = "";
        for (int i = 0; i < pizzas.length; i++) {
            pizzasConcatinated = pizzasConcatinated + pizzas[i].toString() + "\n";
        }
        return pizzasConcatinated;
    }

    @Override
    //Customized toString that prints a formatted version of an Order object
    public String toString() {
        return pizzasToString(pizzas) + "order number: " + orderNr + "\nhas to be ready at "  + pickUpTime + ".";
    }

    //method sets the activeOrders array
    public static void setActiveOrders(Order[] activeOrders) {
        Order.activeOrders = activeOrders;
    }

    //returns all pizzas in all active orders
    public static Pizza[] getActivePizzas(){
        Pizza[] activePizzas = new Pizza[0];
        Pizza[] placeHolderPizzas;
        for (int i = 0; i < activeOrders.length; i++) {
            for (int j = 0; j < activeOrders[i].pizzas.length; j++) {
                placeHolderPizzas = activePizzas;
                activePizzas = new Pizza[placeHolderPizzas.length+1];
                for (int k = 0; k < placeHolderPizzas.length; k++) {
                    activePizzas[k] = placeHolderPizzas[k];
                }
                activePizzas[placeHolderPizzas.length] = activeOrders[i].pizzas[j];
            }
        }
        return activePizzas;
    }

    //method sets the completedOrders array
    public static void setCompletedOrders(Order[] completedOrders) {
        Order.completedOrders = completedOrders;
    }

    //code of Balthazar end
}
