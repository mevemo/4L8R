/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag06;

/**
 *
 * @author arist
 */
public class Bruch {
    
    public static int numberOfObj = 0; 
    
    // Attribute
    private int zaehler; //Modifier = "private"
    private int nenner;

    // Custom Contructor:
    
    public Bruch(int iZaehler, int iNenner) {
        if (iNenner == 0) {
            System.out.println("Nenner darf nicht 0 sein.\nZählerwird nun auf Null gesetzt & Nenner auf 1: ");
            zaehler = 0;
            nenner = 1;
        } else {
            zaehler = iZaehler;
            nenner = iNenner;
        }
        if (nenner < 0) {       //hier vermeiden wir doppelte Minus-Zeichen (je eins bei Zähler & Nenner) und erwirken stattdessen, dass nur 1 Minus-Zeichen vorne beim Bruch erscheint. 
            zaehler = -zaehler;
            nenner = -nenner;
        }
        
        numberOfObj++; 
        System.out.println("\nAnzahl der Objekte aus Klasse Bruch: " + numberOfObj + "\n"); 
         
    }

    // Methoden  zur Manipulation des Objektes
    public void kuerze() {
        int faktor = ggT();
        zaehler = zaehler / faktor;
        nenner = nenner / faktor;
        if (nenner < 0) {
            zaehler = -zaehler;
            nenner = -nenner;
        }
    }

    public void erweitere(int iFaktor) {
        if (iFaktor != 0) {
            zaehler = zaehler * iFaktor;
            nenner = nenner * iFaktor;
            if (nenner < 0) {
                zaehler = -zaehler;
                nenner = -nenner;
            }
        }
    }

//------------------------
    // Ausgabe: hier "überschreiben wir die standardmäßige toString()-Ausgabe mit eigener Ausgabe ("@Override" ist optional). 
    // Wenn hier keine toString()-Funktion stünde und wir in der Test-Klasse das Objekt bru mit println(bru) ausgeben, 
    // bekämen wir die standardmäßige toString()-Ausgabe des Objekts wie folgt: tag06.Bruch@3fee733d. 
    
    @Override
    public String toString() {
        return zaehler + " / " + nenner; //
    }

//    @Override
//    public String toString() {
//        return "Bruch{" + "zaehler=" + zaehler + ", nenner=" + nenner + '}';
//    }


    
   //private Methode ggT()  //alternativ: Methode .gcd() von Java nachschlagen!
    public int ggT() {
    //private int ggT() {
        int a = zaehler;
        int b = nenner;
        int r;
        while (b != 0) {
            r = a % b;
            //System.out.println("r");
            a = b;
            //System.out.println("a");
            b = r;
            //System.out.println("b");
        }
        return a;
    }
    //-----------------
//  public void multipliziere(Bruch iBruch){
//    zaehler = zaehler*iBruch.getZaehler();
//    nenner = nenner*iBruch.getNenner();
//    kuerze();
//  }
//  public void dividiere(Bruch iBruch){
//    if (!iBruch.istNull()){
//      nenner = nenner*iBruch.getZaehler();
//      zaehler = zaehler*iBruch.getNenner();
//    }else{
//      System.out.println("Durch 0 darf man nicht teilen!");
//    }
//    kuerze();
//  }
//  // get-Methoden
//  public int getZaehler() {
//    return zaehler;
//  }
//  public int getNenner() {
//    return nenner;
//  }  
//  
//  public boolean istNull(){
//    if (zaehler == 0){
//      return true;
//    }else{
//      return false;
//    }
//  }
// -----------------------------
    
}
