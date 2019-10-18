package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 15000000;
        int sechser = 0;
        int fuenfer = 0;
        int vierer = 0;
        int dreier = 0;
        int zweier = 0;
        int einer = 0;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for (int i = 1; i <= maxRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            if (die == 6) {
                sechser = sechser + 1;
            }

            else if (die == 5){
                fuenfer = fuenfer + 1;
            }

            else if (die == 4){
                vierer = vierer + 1;
            }

            else if (die == 3){
                dreier = dreier + 1;
            }

            else if (die == 2){
                zweier = zweier + 1;
            }

            else if (die == 1){
                einer = einer + 1;
            }
        }
        System.out.print("Sechser gewürfelt:" + sechser + System.lineSeparator());
        System.out.print("Fünfer gewürfelt:" + fuenfer + System.lineSeparator());
        System.out.print("Vierer gewürfelt:" + vierer + System.lineSeparator());
        System.out.print("Dreier gewürfelt:" + dreier + System.lineSeparator());
        System.out.print("Zweier gewürfelt:" + zweier + System.lineSeparator());
        System.out.print("Einer gewürfelt:" + einer);
    }
}