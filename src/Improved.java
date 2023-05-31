import java.util.Scanner;

public class Improved {
    public static void main(String[] args) {
        System.out.println("Welcome to PTC Restaurant!\n");

        System.out.println("MENU:");
        String[] items = {"Popcorn chicken", "Bubble tea", "Fried rice", "Hamburger", "Ice cream"};
        double[] prices = {10, 7.5, 8, 6, 3.5};

        for(int i = 0; i < items.length; i++){
            System.out.printf("%d. %s - $%.2f%n", i+1, items[i], prices[i]);
        }

        System.out.println("\nWhat would you like to order?");
        System.out.print("Enter the corresponding number: ");
        Scanner s = new Scanner(System.in);
        int order = s.nextInt();
        order -= 1;

        System.out.printf("You have ordered %s.%n", items[order]);
        double bill = prices[order] * 1.13; //add tax
        System.out.printf("The total is $%.2f after tax.%n", bill);

        System.out.println("\nWhat percentage would you like to tip your server?");
        System.out.print("Enter an integer: ");
        int tip = s.nextInt();
        if(tip == 1){
            bill *= 1.15; //add tip
        }
        System.out.printf("Your total is $%.2f.", bill);

        s.close();
    }
}
