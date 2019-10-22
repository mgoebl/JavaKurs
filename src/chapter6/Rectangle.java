package chapter6;

public class Rectangle {

    private double laenge;
    private double breite;

    double berechneUmfang(){
        return (2 * laenge) + (2 * breite);
    }

    double berechneFlaeche(){
        return (laenge * breite);
    }
}
