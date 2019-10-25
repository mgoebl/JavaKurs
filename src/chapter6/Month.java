package chapter6;

public class Month {

    public static String getMonth(int month) {
        switch (month) {
            case 1:
                return "Januar";
            case 2:
                return "Februar";
            case 3:
                return "März";
            case 4:
                return "April";
            case 5:
                return "Mai";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Dezember";
            default:
                return "Ungültige Eingabe. Bitte einen Wert von 1 bis 12 eingeben!";
        }
    }

    public static int getMonth(String month) {
        switch (month) {
            case "Januar":
                return 1;
            case "Februar":
                return 2;
            case "März":
                return 3;
            case "April":
                return 4;
            case "Mai":
                return 5;
            case "Juni":
                return 6;
            case "Juli":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "Oktober":
                return 10;
            case "November":
                return 11;
            case "Dezember":
                return 12;
            default:
                return -1;
        }
    }
}




