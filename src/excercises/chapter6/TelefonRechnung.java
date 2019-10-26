package excercises.chapter6;

public class TelefonRechnung {

    private int id;
    private double grundKosten;
    private int freiMinuten;
    private int verbrauchteMinuten;

    public TelefonRechnung(){
        id = 0;
        grundKosten = 15;
        freiMinuten = 100;
        verbrauchteMinuten = 340;
    }

    public TelefonRechnung(int id){
        this.id = id;
        grundKosten = 15;
        freiMinuten = 100;
        verbrauchteMinuten = 25;
    }

    public TelefonRechnung(int id, double grundKosten, int freiMinuten, int verbrauchteMinuten){
       this.id = id;
       this.grundKosten = grundKosten;
       this.freiMinuten = freiMinuten;
       this.verbrauchteMinuten = verbrauchteMinuten;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getGrundKosten(){
        return grundKosten;
    }

    public void setGrundkosten(double grundKosten){
        this.grundKosten = grundKosten;
    }

    public int getFreiMinuten(){
        return freiMinuten;
    }

    public void setFreiMinuten(int minuten){
        this.freiMinuten = minuten;
    }

    public int getVerbrauchteMinuten(){
        return verbrauchteMinuten;
    }

    public void setVerbrauchteMinuten(int minuten){
        this.verbrauchteMinuten = minuten;
    }

    private double berechneUeberschuss(){
        if(verbrauchteMinuten <= freiMinuten){
            return 0;
        }
        double mehrVerbrauchsRate = 0.09;
        double mehrVerbrauchsMinuten = verbrauchteMinuten - freiMinuten;
        return mehrVerbrauchsMinuten * mehrVerbrauchsRate;
    }

    private double berechneSteuer (){
        double steuerSatz = 0.14;
        return steuerSatz *  (grundKosten + berechneUeberschuss());
    }

    private double berechneGesamt(){
        return grundKosten + berechneUeberschuss() + berechneSteuer();
    }

    public void druckeEinzelpostenRechnung(){
        System.out.println("ID:" + id);
        System.out.println("Grundkosten: €" + grundKosten);
        System.out.println("Ueberschuss Gebühr: €" + String.format("%.2f", berechneUeberschuss()));
        System.out.println("Steuer: €" + String.format("%.2f", berechneSteuer()));
        System.out.println("Gesamtkosten: €" + String.format("%.2f", berechneGesamt()));
    }
}
