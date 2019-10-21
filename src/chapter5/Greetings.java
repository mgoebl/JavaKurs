package chapter5;

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */
public class Greetings {

    public static void main(String[] args){

        System.out.println("Gib Deinen Namen ein:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String nachName = scanner.next();
        scanner.close();
        greetUser(name, nachName);
    }

    private static void greetUser(String n, String nn){

        System.out.println("Hallo, " + n + ", " + nn);
    }
}
