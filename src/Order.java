public class Order {
    //code of Balthazar start
    private Pizza[] pizzas;
    private int pickUpTime;
    private String orderNr;

    public String toReciept(){
        return "order number: " + orderNr + "\n" + pizzas.toString();
    }

    public Order(Pizza[] pizzas, int pickUpTime, String orderNr) {
        this.pizzas = pizzas;
        this.pickUpTime = pickUpTime;
        this.orderNr = orderNr;
    }

    //code of Balthazar end

}
