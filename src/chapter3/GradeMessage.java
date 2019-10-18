package chapter3;
/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your Letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade){
            case "A":
                message = "Exellent Job";
                break;
            case "B":
                message = "Great Job";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh no";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
        System.out.println(message);
    }
}
