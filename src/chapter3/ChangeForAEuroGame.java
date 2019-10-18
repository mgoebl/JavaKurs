package chapter3;

import javax.swing.*;
import java.util.Scanner;

public class ChangeForAEuroGame {

    public static void main(String[] args) {

        double cent = .01;
        double twocent = .02;
        double fivecent = .05;
        double tencent = .10;
        double twentycent = .20;
        double fiftycent = .50;
        int euro = 1;

        Scanner scanner = new Scanner(System.in);

                System.out.println("Willkommen zu 'Wechselgeld für einen Euro'!" +
                        "Dein Ziel ist es genug Münzen einzugeben um einen Euro zusammenzubingen");

        System.out.println("Gib die Anzahl der Eincentstücke an:");
        int numOfOnecent = scanner.nextInt();

        System.out.println("Gib die Anzahl der Zweicentstücke an:");
        int numOfTwocent = scanner.nextInt();

        System.out.println("Gib die Anzahl der Fünfcentstücke an:");
        int numOfFivecent = scanner.nextInt();

        System.out.println("Gib die Anzahl der Zehncentstücke an:");
        int numOfTencent = scanner.nextInt();

        System.out.println("Gib die Anzahl der Zwanzigcentstücke an:");
        int numOfTwentycent = scanner.nextInt();

        System.out.println("Gib die Anzahl der Fünfigcentstücke an:");
        int numOfFiftycent = scanner.nextInt();

        scanner.close();

        double total = numOfOnecent * cent + numOfTwocent * twocent + numOfFivecent * fivecent + numOfTencent * tencent + numOfTwentycent * twentycent + numOfFiftycent * fiftycent;

        if(total < euro){
           double amountShort = euro - total;
           System.out.println("Du hast verloren. Tut mir leid. Du hast "  + String.format("%.2f", amountShort) +  " Euro zuwenig.");
        }
        else if(total > euro){
            double amountOver = total - euro;
            System.out.println("Du hast verloren! Tut mir leid. Du hast "  + String.format("%.2f", amountOver) +  " Euro zuviel.");
        }
        else{
            System.out.println("Yep! Du hast gewonnen. Das ist genau ein Euro!");
        }
    }
}
