package chapter7;

import java.util.Random;

public class LotterieLos {

    public static final int LAENGE = 6;
    public static final int MAX_ANZAHL_ZAHLEN = 69;

    public static void main(String[] args) {
    int[] los = generiereNummern();
    druckeLos(los);
    }

    public static int[] generiereNummern(){
        int[] los = new int[LAENGE];
        Random zufallszahl = new Random();

        for(int i=0; i<LAENGE; i++){
            los[i] = zufallszahl.nextInt(MAX_ANZAHL_ZAHLEN)+1;
        }
    return los;
    }

    public static void druckeLos(int[] los){
        for(int i=0; i<LAENGE; i++){
            System.out.print(los[i] + " | ");
        }
    }
}