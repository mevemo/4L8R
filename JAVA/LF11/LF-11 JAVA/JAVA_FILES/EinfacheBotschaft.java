package Vererbung_Ueberlagerung;
/*
* Beispielanwendung für Polymorphismus und Konstruktoren in Java
*/
class EinfacheBotschaft
{
   String meldung1;
 
   public EinfacheBotschaft(String text1)
   {
      meldung1 = text1;
 
      gebeBotschaftAus();
   }
 
   public void gebeBotschaftAus()
   {
      System.out.println("Erste Meldung: " + meldung1);
   }
}
 
