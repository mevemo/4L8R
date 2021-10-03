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
public class CollatzFolge02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eingabe, ausgabe; 
        eingabe = JOptionPane.showInputDialog("eine Zahl eingeben.."); 
        int x; 
        x= Integer.parseInt(eingabe);
        int count = 0;
        int groesste;
        groesste = x;
        
        while (x !=1) {
            if (x>=groesste) {
                groesste = x; 
            }
            if  (x % 2 == 0) {
                x = x/2;
            }
            else {
                    x = x * 3 + 1;
            }
            count++; 
        }
        
        ausgabe = "count: " + count; 
        JOptionPane.showMessageDialog(null, ausgabe);
        ausgabe = "groesste: " + groesste;
        JOptionPane.showMessageDialog(null, ausgabe);
    }
  
}
