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
        System.out.println("You've chosen Alfonso. What would you like to do?\n1. create new order\n");

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
