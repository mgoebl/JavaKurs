package chapter6;

public class WohnFlaechenRechner {

    public static void main(String[] args){
        /*
         Rechteck 1
        */
        Rechteck raum1 = new Rechteck( 100, 20);
        //raum1.setzeLaenge(50);
        //raum1.setzeBreite(20);
        double raum1Flaeche = raum1.berechneFlaeche();
        /*
        Rechteck 2
        */
        Rechteck raum2 = new Rechteck(150, 120);
        double raum2Flaeche = raum2.berechneFlaeche();
        double  raum1undraum2 = raum1Flaeche + raum2Flaeche;

        System.out.println("Beide Räume haben eine Fläche von:" + raum1undraum2);
    }
}
