package chapter6;

import java.util.Scanner;

public class Wohnflaechenrechner2 {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Wohnflaechenrechner2 arechner = new Wohnflaechenrechner2();
        Rechteck kueche = arechner.holeRaum();
        Rechteck bad = arechner.holeRaum();

        double fleaeche = arechner.berechneGanzeFlaeche(kueche, bad);

        System.out.println("Die Fläche hat:" + fleaeche);

        arechner.scanner.close();
    }

    public Rechteck holeRaum(){
        System.out.println("Gebe die Länge des Raumes ein:");
        double laenge = scanner.nextDouble();

        System.out.println("Gebe die Breite des Raumes ein:");
        double breite = scanner.nextDouble();

        return new Rechteck(laenge, breite);
    }

    public double berechneGanzeFlaeche (Rechteck rechteck1, Rechteck rechteck2){
        return rechteck1.berechneFlaeche() + rechteck2.berechneFlaeche();
    }
}
