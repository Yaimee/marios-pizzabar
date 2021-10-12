import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static boolean run;

    static public void mario() {
        System.out.println("You've chosen Mario.\nWhat would you like to do?\n1. print orders\n2. print next pizza\n3. print menu");
        int select = scan.nextInt();
        scan.nextLine();
        if (select == 1) {

        } else if (select == 2) {
            System.out.println("Next pizza is: ");
            System.out.println("");
        } else if (select == 3) {
            System.out.println("The menu is: ");
            for(int i = 1; i <= 10; i++) {
                System.out.println(Menu.getPizzaNumber(i));
            }
        }
    }

    static public void alfonso() {
        System.out.println("You've chosen Alfonso.\n What would you like to do?\n1. create new order\n");
        int select = scan.nextInt();
        if (select == 1){
            Order order = createNewOrder();
        }
    }

    static public Order createNewOrder(){
        Scanner scanner = new Scanner(System.in);
        Pizza[] pizzas = new Pizza[0];
        int pizzaId;
        int minimumTime = 0;
        do {
            System.out.println("witch pizza do you want to add (0 for no more pizzas)");
            if (pizzaId == 0){
                break;
            }
            pizzaId = scanner.nextInt();
            Pizza pizza = Menu.getPizzaNumber(pizzaId);
            Pizza[] newPizzas = new Pizza[pizzas.length+1];
            for (int i = 0; i < pizzas.length; i++) {
                newPizzas[i] = pizzas[i];
            }
            newPizzas[newPizzas.length-1] = pizza;
            pizzas = newPizzas;
        } while (pizzaId != 0);
        for (int i = 0; i < Order.getActiveOrders().length; i++) {
            minimumTime = minimumTime + Order.getActiveOrders()[i].getPizzas().length;
        }
        System.out.println("what time do you want your order picked up? (minimum: " + minimumTime +")");
        int pickUpTime = scanner.nextInt();
        if (pickUpTime < minimumTime){
            pickUpTime = minimumTime;
        }
        int orderNr = Order.getActiveOrders().length + Order.getCompletedOrders().length;
        return new Order(pizzas, pickUpTime, orderNr);
    }

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
