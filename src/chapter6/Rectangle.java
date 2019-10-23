package chapter6;

public class Rectangle {

    private double laenge;
    private double breite;

    public Rectangle(){
        laenge = 0;
        breite = 0;
    }

    Rectangle(double laenge, double breite){
   //     this.laenge = laenge; //Wert wird entweder mit this. gesetzt
        setzeLaenge(laenge);
        setzeBreite(breite); // oder mit der Setter-Methode - beides ist möglich und ok!
    }

    void setzeLaenge(double laenge){
        this.laenge = laenge;
    }

    public double holeLaenge(){
        return laenge;
    }

    void setzeBreite(double breite){
        this.breite = breite;
    }

    public double holeBreite(){
        return breite;
    }

    double berechneUmfang(){
        return (2 * laenge) + (2 * breite);
    }

    double berechneFlaeche(){
        return (laenge * breite);
    }
}
