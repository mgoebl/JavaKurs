package chapter4;


import java.util.Scanner;

/* do while Schleife
Schreibe ein Programm, welches dem Anwender erlaubt, zwei Zahlen einzugeben, welche summiert werden.
Der Anwender soll diesen Vorgang solange wiederholen können, bis er fertig ist.
 */
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                boolean nochmal;

        do {
            System.out.println("Gebe die erste Nummer ein:");
            double num1 = scanner.nextDouble();

            System.out.println("Gebe die zweite Nummer ein:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("Die Summe ist:" + sum);

            System.out.println("Wollen sie weitermachen?");
            nochmal = scanner.nextBoolean();
        } while (nochmal);

        scanner.close();

    }
}
