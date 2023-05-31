import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World"); -> change to restaurant
        System.out.println("Welcome to PTC Restaurant!\n");

        System.out.println("MENU:");

        //declare variables for menu items
        String item1 = "Popcorn chicken"; //get audience suggestions
        String item2 = "Bubble tea";
        String item3 = "Fried rice";
        String item4 = "Hamburger";
        String item5 = "Ice cream";

        //declare prices for menu items
        //int price1 = 10; -> change to a double
        double price1 = 10; //get audience suggestions
        double price2 = 7.5;
        double price3 = 8;
        double price4 = 6;
        double price5 = 3.5;

        //Display menu
        //System.out.println(item1 + " - $" + price1); -> change to printf
        System.out.printf("1. %s - $%.2f%n", item1, price1);
        System.out.printf("2. %s - $%.2f%n", item2, price2);
        System.out.printf("3. %s - $%.2f%n", item3, price3);
        System.out.printf("4. %s - $%.2f%n", item4, price4);
        System.out.printf("5. %s - $%.2f%n", item5, price5);

        //get customer order
        System.out.println("\nWhat would you like to order?");
        Scanner s = new Scanner(System.in); //how to use scanner to get user input? Ideas?
        //add numbers to menu, get user to input the number

        int order = s.nextInt();
        double bill = 0;

        //explain if structure
        if(order == 1) {
            System.out.printf("You have ordered %s.%n", item1);
            bill = price1 * 1.13;
            System.out.printf("Your meal costs $%.2f after tax.", bill);
        } else if(order == 2) {
            System.out.printf("You have ordered %s.%n", item2);
            bill = price2 * 1.13;
            System.out.printf("Your meal costs $%.2f after tax.", bill);
        } else if(order == 3) {
            System.out.printf("You have ordered %s.%n", item3);
            bill = price3 * 1.13;
            System.out.printf("Your meal costs $%.2f after tax.", bill);
        } else if(order == 4) {
            System.out.printf("You have ordered %s.%n", item4);
            bill = price4 * 1.13;
            System.out.printf("Your meal costs $%.2f after tax.", bill);
        } else if (order == 5) {
            System.out.printf("You have ordered %s.%n", item5);
            bill = price5 * 1.13;
            System.out.printf("Your meal costs $%.2f after tax.", bill);
        }

        System.out.println("\n\nWould you like to tip your server?");
        System.out.println("1. Yes\n2. No");
        int tip = s.nextInt();

        if(tip == 1){
            bill *= 1.15; //tip 15%
        }
        System.out.printf("Your total is $%.2f.", bill);

        /*improvements if there's time
        - Change menu items and prices to an array
        - Senior / child discounts
        - Let user enter a custom tip %
        */
    }
}
