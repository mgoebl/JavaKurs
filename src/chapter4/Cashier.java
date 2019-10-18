package chapter4;

import java.util.Scanner;

/* for-loop
Write a cashier-program that will scan a given number of items and tally the cost.
 */

public class Cashier {
    public static void main(String[] args) {

        //get the number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);

                int quantity = scanner.nextInt();

                double total = 0;
        // create loop to iterate all items and accumulate the costs
        for (int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println("Your total ist: €" + total);

    }
}
