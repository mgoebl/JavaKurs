package excercises.chapter6;

public class TelefonRechnungBerechnen {
    public static void main(String[] args){
        TelefonRechnung rechnung = new TelefonRechnung(123456);
        rechnung.setVerbrauchteMinuten(1000);
        rechnung.druckeEinzelpostenRechnung();
    }
}
