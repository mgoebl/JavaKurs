package chapter6;

public class Rechteck {

    private double laenge;
    private double breite;
/* benötigt es diesen Construktor oder funktioniert das Ganze auch mit javas eingebauten default-Contruktor
    public Rechteck(){
        laenge = 0;
        breite = 0;
    }
*/
    Rechteck(double laenge, double breite){
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
