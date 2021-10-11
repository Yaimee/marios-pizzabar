import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static boolean run;

    static public void mario() {
        System.out.println("You've chosen Mario.\nWhat would you like to do?\n1. print orders\n2. print next pizza");
        int select = scan.nextInt();
        if (select == 1) {

        } else if (select == 2) {
            System.out.println("Next pizza is: ");
            System.out.println("");
        }
    }

    static public void alfonso() {
        System.out.println("You've chosen Alfonso.\n What would you like to do?\n1. create new order\n");
        int select = scan.nextInt();
    }

    public static void main(String[] args) {
        do {
            run = false;
            try {
                System.out.println("Which pizzaguy do you want to select? (alfonso/mario)");
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
