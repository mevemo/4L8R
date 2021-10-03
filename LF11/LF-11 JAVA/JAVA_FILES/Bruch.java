public class Bruch {

    public static int numberOfObj = 0;

    private int zaehler;
    private int nenner;

    //Konstruktor
    public Bruch(int iZaehler, int iNenner){
        if (iNenner == 0){
            System.out.println("Nenner darf nicht 0 sein. \nZähler wird nun auf Null gesetzt & Nenner auf 1: ");
            zaehler = 0;
            nenner = 1;
        }else{
            zaehler = iZaehler;
            nenner = iNenner;
        }
        if (nenner < 0) {
            zaehler = - zaehler;
            nenner = - nenner;
        }
    //
    }
    public void erweitere(int iFaktor){
        if (iFaktor != 0){
            zaehler = zaehler * iFaktor;
            nenner = - nenner * iFaktor;
        }
        if (nenner < 0){
            zaehler = - zaehler;
            nenner = - nenner;
        }
    }

    public void kuerze(){
        int faktor = ggT();
        zaehler = zaehler / faktor;
        nenner = nenner / faktor;
        if(nenner < 0){
            zaehler = -zaehler;
            nenner = - nenner;
        }
    }

    private int ggT(){
                int a = zaehler;
        int b = nenner;
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
    @Override
    public String toString() {
        return zaehler + " / " + nenner;
    }
//    @Override
//    public String toString() {
//        return "Bruch{" + "zaehler=" + zaehler + ", nenner=" + nenner + '}';
//          }
}