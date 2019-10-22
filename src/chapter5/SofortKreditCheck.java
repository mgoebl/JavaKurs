package chapter5;

/* schreibe ein Programm, welches jedem einen Kredit gewährt, der mehr als 25000€ verdient und einen
Kreditscore von mindestens 700 hat. Alle anderen bekommen keinen Kredit.
 */

import java.util.Scanner;

public class SofortKreditCheck {

    //definiert globale Variablen
    private static int benoetigtesEinkommen = 25000;
    private static int benoetigterKreditScore = 700;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //definiert lokale Variablen
        double einkommen = holeEinkommen();
        int kreditScore = holeKreditScore();
        scanner.close();
        // Prüfe ob der Benutzer für einen Kredit qualifiziert ist
        boolean istBenutzerQualifiziert = istBenutzerQualifiziert(kreditScore, einkommen);
        informiereBenutzer(istBenutzerQualifiziert);
        // ein  neuer Kommentar von Mickey
    }
private static double holeEinkommen() {
        System.out.println("Gebe dein Einkommen ein:");
        return scanner.nextDouble();
    }

private static int holeKreditScore() {
        System.out.println("Gebe deinen Kreditscore ein:");
        return scanner.nextInt();
    }

private static boolean istBenutzerQualifiziert(int k, double e) {
    return k >= benoetigterKreditScore && e >= benoetigtesEinkommen;
    }

private static void informiereBenutzer(boolean istQualifiziert) {
        if (istQualifiziert) {
            System.out.println("Sie bekommen einen Kredit!");
        }
        else{
                System.out.println("Ihnen wird kein Kredit gewährt.");
        }
    }
}
