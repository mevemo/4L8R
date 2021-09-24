package tag01;

public class FirstMain {

    public static void main(String[] args) {

        //Unterschied zwischen "println()" (Zeilenende wird vorgegeben -> return bzw. line break) 
        //und "print()" (Zeile wird nicht abgeschlossen): 
        String meintext = "..na das wird ja spannend!";
        System.out.print("Hallo "); //beachte den BEfehl "print" statt "println" -> Zeile wird nicht abgeschlossen!
        System.out.println("zusammen!");
        System.out.println(); //neue Zeile, wenn Parameterbereich leer! 
        System.out.println("Es geht weiter mit einem 2-wöchigen Java-Kurs!");

        System.out.println(meintext);
    }

}
