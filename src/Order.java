import java.util.Arrays;

public class Order {
    //code of Balthazar start
    private Pizza[] pizzas;
    private final int pickUpTime;
    private final int orderNr;
    private static Order[] activeOrders;
    private static Order[] completedOrders;

    public String toReciept(){
        return "order number: " + orderNr + "\n" + Arrays.toString(pizzas);
    }

    public Order(Pizza[] pizzas, int pickUpTime, int orderNr) {
        this.pizzas = pizzas;
        this.pickUpTime = pickUpTime;
        this.orderNr = orderNr;
    }

    public static Order[] getActiveOrders() {
        return activeOrders;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public static Order[] getCompletedOrders() {
        return completedOrders;
    }
    //code of Balthazar end

}
