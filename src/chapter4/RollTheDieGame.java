package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 6;
        Random random = new Random();

        System.out.println("Willkommen zu Wirf den Würfel! Fang an...");

        for (int i = 1; i <= maxRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Wurf #%d: Du hast eine %d. gewürfelt. ", i, die));

            if(currentSpace == lastSpace){
                System.out.print("Du bist genau bei " + currentSpace + ". Gewonnen!");
                break;
            }
            else if(currentSpace > lastSpace){
                System.out.print("Unglücklicherweise bingt dich dieser Wurf über die Grenze von " + lastSpace + ". Du hast verloren!");
                break;
            }
            else if(i == maxRolls){
                System.out.println("Du hast " + currentSpace + " erreicht.");
                System.out.println("Unglücklicherweise bleibst Du unter dem Bereich von" +
                        lastSpace + " Schritten. Du hast verloren!");
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("Du hast nun " + currentSpace +
                        " Schritte gemacht und brauchst " + spacesToGo + " mehr.");
            }

            System.out.println();
        }
    }
}
