package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        // Variablen initialisieren
        int rate = 15;
        int maxHours = 40;

        // Eingabe holen für die bekannten Variablen

        System.out.println("Wieviele Wochenstunden haben sie?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Eingabe prüfen

        while (hoursWorked > maxHours){
            System.out.println("Ungültige Eingabe. Die Wochenstunden müssen zwischen 1 und 40 Stunden sein:");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        // Ausgabe
        double gross = rate * hoursWorked;
        System.out.println("Einkommen: €:" + gross);
    }
}
