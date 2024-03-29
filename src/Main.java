import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static boolean run;
    static boolean run2;
    //rasmus's kode start
    static public void mario() {
        do {
            run = false;
            try {
                System.out.println("You've chosen Mario. What would you like to do?\n1. print active orders\n2. print next order\n3. print menu\n4. print completed orders\n5. print next pizza\n6. next pizza done");
                int select = scan.nextInt();
                scan.nextLine();
                if (select == 1) {
                    try {
                        for (int i = 0; i < Order.getActiveOrders().length; i++) {
                            System.out.println(Order.getActiveOrders()[i]);
                        }
                    } catch (Exception e) {
                        System.out.println("There are no active orders at the moment.");
                    }
                } else if (select == 2) {
                    System.out.println("Next order is: ");
                    System.out.println(Order.getActiveOrders()[0]);
                } else if (select == 3) {
                    System.out.println("The menu is: ");
                    for(int i = 1; i <= 10; i++) {
                        System.out.println(Menu.getPizzaNumber(i));
                    }
                } else if (select == 4) {
                    try {
                        for (int i = 0; i < Order.getCompletedOrders().length; i++) {
                            System.out.println(Order.getCompletedOrders()[i]);
                        }
                    } catch (Exception e) {
                        System.out.println("\nNo orders completed.\n");
                        run = true;
                    }
                    //rasmus's kode slut
                    // code of balthazar (start)
                } else if (select == 5) {
                    for (int i = 0; i < Order.getActiveOrders()[0].getPizzas().length; i++) {
                        if (!Order.getActiveOrders()[0].getPizzas()[i].getCompleted()) {
                            System.out.println(Order.getActiveOrders()[0].getPizzas()[i]);
                            break;
                        }
                    }
                } else if (select == 6) {
                    boolean orderDone = true;
                    for (int i = 0; i < Order.getActiveOrders()[0].getPizzas().length; i++) {
                        if (!Order.getActiveOrders()[0].getPizzas()[i].getCompleted()) {
                            Order.getActiveOrders()[0].getPizzas()[i].setCompleted(true);
                            for (int j = 0; j < Order.getActiveOrders()[0].getPizzas().length; j++) {
                                if (!Order.getActiveOrders()[0].getPizzas()[j].getCompleted()) {
                                    orderDone = false;
                                }
                            }
                            break;
                        }
                    }
                    if (orderDone == true){
                        Order[] placeHolderOrders;
                        try {
                            placeHolderOrders = new Order[Order.getCompletedOrders().length + 1];
                            for (int i = 0; i < Order.getCompletedOrders().length; i++) {
                                placeHolderOrders[i] = Order.getCompletedOrders()[i];
                                placeHolderOrders[Order.getCompletedOrders().length] = Order.getActiveOrders()[0];
                            }
                        } catch (Exception e){
                            placeHolderOrders = new Order[1];
                            placeHolderOrders[0] = Order.getActiveOrders()[0];
                        }
                        Order.setCompletedOrders(placeHolderOrders);
                        placeHolderOrders = new Order[Order.getActiveOrders().length-1] ;
                        for (int i = 0; i < Order.getActiveOrders().length-1; i++) {
                            placeHolderOrders[i] = Order.getActiveOrders()[i+1];
                        }
                        Order.setActiveOrders(placeHolderOrders);
                    }
                    //code of balthazar (end)
                    //rasmus's kode start
                } else {
                    System.out.println("Illegal value! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Illegal value! Please try again.");
                run = true;
            }
        } while (run);
    }
    //he
    //rasmus's kode slut
    //rasmus's kode start
    static public void alfonso() {
        System.out.println("You've chosen Alfonso.");
        do {
            run = false;
            System.out.println("Create new order");
            Order order = createNewOrder();
            /*Tager array fra active orders, sætter dem i rækkefølge fra den bestilling med mindst pickUpTime
             og den med størst pickUpTime i sidste element i array'et.*/
            Order.setActiveOrders(rearrangeActiveOrders(Order.getActiveOrders().length));
            System.out.println(order.toString());
            do {
                System.out.println("Would you like to create another order? (y/n).");
                try {
                    String choice = scan.nextLine();
                    if (choice.equals("y")) {
                        run = true;
                    } else if (choice.equals("n")) {

                    } else {
                        System.out.println("Illegal value! Please try again.");
                        run2 = true;
                    }
                } catch (Exception e) {
                    System.out.println("Illegal value! Please try again.");
                    run2 = true;
                }
            } while (run2);
        } while (run);
    }
    //rasmus's kode slut
    //rasmus's kode start
    public static Order[] rearrangeActiveOrders(int length) {
        Order[] ordersSorted = new Order[length];
        int[] pickUpTimeSorted = new int[length];
        for (int i = 0; i < length; i++) {
            pickUpTimeSorted[i] = Order.getActiveOrders()[i].getPickUpTime();
        }
        Arrays.sort(pickUpTimeSorted);
        for (int i = 0; i < length; i++) {
            for (int u = 0; u < length; u++) {
                if (pickUpTimeSorted[i] == Order.getActiveOrders()[u].getPickUpTime()) {
                    ordersSorted[i] = Order.getActiveOrders()[u];
                }
            }
        }
        return ordersSorted;
    }
    // rasmus's kode slut
    // code of Balthazar(start)
    static public Order createNewOrder(){
        Pizza[] pizzas = new Pizza[0];
        int pizzaId;
        int minimumTime = 0;
        int orderNr = 0;
        //creates and adds the pizzas
        System.out.println("which pizza do you want to add");
        pizzaId = scan.nextInt();
        scan.nextLine();
        do {
            Pizza pizza = Menu.getPizzaNumber(pizzaId);
            Pizza[] newPizzas = new Pizza[pizzas.length+1];
            for (int i = 0; i < pizzas.length; i++) {
                newPizzas[i] = pizzas[i];
            }
            newPizzas[newPizzas.length-1] = pizza;
            pizzas = newPizzas;
            System.out.println("which pizza do you want to add (0 for no more pizzas)");
            pizzaId = scan.nextInt();
            scan.nextLine();
        } while (pizzaId != 0);
        //sets the pickup time to be no less than the minimum time
        try {
                minimumTime = Order.getActivePizzas().length * 15 + pizzas.length * 15;
        } catch (Exception e) {
            minimumTime = pizzas.length * 15;
        }
        //sets the pick up time to be no less than the minimum time
        System.out.println("what time do you want your order picked up? (minimum: " + minimumTime +")");
        int pickUpTime = scan.nextInt();
        scan.nextLine();
        if (pickUpTime < minimumTime){
            pickUpTime = minimumTime;
        }
        //sets the order nr
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
        //adds the order to active orders
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
    //n
    public static void main(String[] args) {
        // rasmus's kode start
        do {
            run = false;
            try {
                System.out.println("Which pizza guy do you want to select? (\"1\" for Mario/\"2\" for Alfonso) or terminate the program? (\"y\")");
                String name = scan.nextLine();
                if (name.equals("1")) {
                    mario();
                    run = true;
                } else if (name.equals("2")) {
                    alfonso();
                    run = true;
                } else if (name.equals("y")){
                    System.out.println("Goodbye!");
                } else {
                    System.out.println("Illegal value! Please try again.");
                    run = true;
                }
            } catch (Exception e) {
                System.out.println("Illegal value! Please use letters.");
                run = true;
            }
        } while (run);
        // rasmus's kode slut

    }
}
