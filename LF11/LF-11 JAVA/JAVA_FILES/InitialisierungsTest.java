//
//Quelle; https://www.programmierenlernenhq.de/polymorphismus-und-konstruktoren-java/
//
package Vererbung_Ueberlagerung; 

import Vererbung_Ueberlagerung.EinfacheBotschaft;
import Vererbung_Ueberlagerung.ZweifacheBotschaft;

public class InitialisierungsTest
{
  public static void main (String[] args)
  {
     //System.out.println("\nZB-Objekt in Variable vom Typ EB:");
     //EinfacheBotschaft obj1 = new ZweifacheBotschaft("Zweifache", "Botschaft");
 
     System.out.println("\nEB-Objekt in Variable vom Typ EB:");
     EinfacheBotschaft obj3 = new EinfacheBotschaft("text1");
     
     System.out.println("\nZB-Objekt in Variable vom Typ ZB:");
     ZweifacheBotschaft obj2 = new ZweifacheBotschaft("text1", "text2"); 
    //ACHTUNG: hier werden nun durch Vererbung BEIDE Konstruktoren aufgerufen (von Klassen EB & ZB)!

  }
}

