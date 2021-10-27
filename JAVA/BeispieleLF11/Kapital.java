/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag03;
import javax.swing.JOptionPane; 
/**
 *
 * @author arist
 */
public class Kapital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eingabe, ausgabe; 
        float startkapital, endkapital; 
        float zinssatz; 
        int jahre = 0;
        eingabe = JOptionPane.showInputDialog("Startkapital eingeben..");
        startkapital = Float.parseFloat(eingabe); 
        eingabe = JOptionPane.showInputDialog("Zinssatz einegeben.."); 
        zinssatz = Float.parseFloat(eingabe); 
        
        endkapital = startkapital; 
        while (endkapital < 2 * startkapital) {
            jahre++; 
            endkapital *= (1 + zinssatz/100); //= endkapital + (endkapital * zinssatz)
        }
//        ausgabe = String.format("Das Startkapital von %,.3f €" 
//                   + "\nhat sich nach %d Jahren verdopelt."
//                   + "\nEndkapital: %,.3f €", startkapital, jahre, endkapital);
          
          ausgabe = String.format("Endkapital: %,.3f €.\nZinssatz: %,.3f %%", endkapital, zinssatz);
          JOptionPane.showMessageDialog(null, endkapital);
          //JOptionPane.showMessageDialog(null, ausgabe);
    }
}

// Platzhalter %d = decimal integer, %,.2f = float - Darstellung mit 2 Nachkommastellen 