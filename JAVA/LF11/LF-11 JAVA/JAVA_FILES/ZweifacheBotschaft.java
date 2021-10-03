package Vererbung_Ueberlagerung;

import Vererbung_Ueberlagerung.EinfacheBotschaft;

class ZweifacheBotschaft extends EinfacheBotschaft
{
   String meldung2;
 
   public ZweifacheBotschaft(String text1, String text2)
   {
      super(text1); //meldung1 der Mutterklasse wird durch "super" aufgerufen!
      meldung2 = text2;
 
      gebeBotschaftAus();
   }
 
   public void gebeBotschaftAus()
   {
      System.out.println("Erste Meldung: " + meldung1 + " Zweite Meldung: " + meldung2);
   }
}


