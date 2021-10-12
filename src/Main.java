import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static boolean run;

    static public void mario() {
        System.out.println("You've chosen Mario. What would you like to do?\n1. print orders\n2. print next pizza\n3. print menu");
        int select = scan.nextInt();
        scan.nextLine();
        if (select == 1) {
            for (int i = 0; i < Order.getActiveOrders().length; i++) {

            }
        } else if (select == 2) {
            System.out.println("Next pizza is: ");
            System.out.println("");
        } else if (select == 3) {
            System.out.println("The menu is: ");
            for(int i = 1; i <= 10; i++) {
                System.out.println(Menu.getPizzaNumber(i));
                System.out.println("hej");
            }
        }
    }

    static public void alfonso() {
        System.out.println("You've chosen Alfonso.\n What would you like to do?\n1. create new order\n");
        int select = scan.nextInt();
        if (select == 1){
            Order order = createNewOrder();
            System.out.println(order.toString());
        }
    }
    // code of Balthazar(start)
    static public Order createNewOrder(){
        Scanner scanner = new Scanner(System.in);
        Pizza[] pizzas = new Pizza[0];
        int pizzaId;
        int minimumTime = 0;
        int orderNr = 0;
        System.out.println("which pizza do you want to add");
        pizzaId = scanner.nextInt();
        do {
            Pizza pizza = Menu.getPizzaNumber(pizzaId);
            Pizza[] newPizzas = new Pizza[pizzas.length+1];
            for (int i = 0; i < pizzas.length; i++) {
                newPizzas[i] = pizzas[i];
            }
            newPizzas[newPizzas.length-1] = pizza;
            pizzas = newPizzas;
            System.out.println("witch pizza do you want to add (0 for no more pizzas)");
            pizzaId = scanner.nextInt();
        } while (pizzaId != 0);
        try {
            for (int i = 0; i < Order.getActiveOrders().length; i++) {
                minimumTime = minimumTime + Order.getActiveOrders()[i].getPizzas().length;
            }
        } catch (Exception e) {
            minimumTime = 15;
        }
        System.out.println("what time do you want your order picked up? (minimum: " + minimumTime +")");
        int pickUpTime = scanner.nextInt();
        if (pickUpTime < minimumTime){
            pickUpTime = minimumTime;
        }
        try {
            orderNr = Order.getActiveOrders().length + Order.getCompletedOrders().length + 1;
        } catch (Exception exception){
            try {
                orderNr = Order.getActiveOrders().length + 1;
            } catch (Exception exception1){
                try {
                    orderNr = Order.getCompletedOrders().length + 1;
                } catch (Exception exception2){
                    orderNr = 1;
                }
            }
        }
        Order order = new Order(pizzas, pickUpTime, orderNr);
        Order[] activeOrders = Order.getActiveOrders();
        Order[] newActiveOrders;
        try {
            newActiveOrders = new Order[activeOrders.length + 1];
            for (int i = 0; i < activeOrders.length; i++) {
                newActiveOrders[i] = activeOrders[i];
            }
        }catch (Exception e){
            newActiveOrders = new Order[1];
        }
        newActiveOrders[newActiveOrders.length-1] = order;
        Order.setActiveOrders(newActiveOrders);
        return order;
    }
    // code of Balthazar(end)

    public static void main(String[] args) {
        do {
            run = false;
            try {
                System.out.println("Which pizza guy do you want to select? (alfonso/mario)");
                String name = scan.nextLine();
                if (name.equals("mario")) {
                    mario();
                } else if (name.equals("alfonso")) {
                    alfonso();
                } else {
                    System.out.println("Illegal value!");
                    run = true;
                }
            } catch (Exception e) {
                System.out.println("Illegal value! Please use letters.");
                run = true;
            }
        } while (run);

    }
}
