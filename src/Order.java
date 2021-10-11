public class Order {
    //code of Balthazar start
    private Pizza[] pizzas;
    private int pickUpTime;
    private String orderNr;

    public String getReciept(){

        return "order number: " + orderNr + "\n" + pizzas.toString();
    }


    //code of Balthazar end

}
