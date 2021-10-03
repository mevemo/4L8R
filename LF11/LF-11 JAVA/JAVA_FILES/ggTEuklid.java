/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag02;

import javax.swing.JOptionPane;

/**
 *
 * @author arist
 */
public class ggTEuklid {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] parms) {
        int m, n, r;
        String eingabe1, eingabe2;
        eingabe1 = JOptionPane.showInputDialog("geben Sie die erste Zahl ein");
        eingabe2 = JOptionPane.showInputDialog("geben Sie die zweite Zahl ein");
        System.out.println("erste Eingabe: " + eingabe1);
        System.out.println("zweite Eingabe: " + eingabe2);
       
        m = Integer.parseInt(eingabe1); //parseInt(var) nur für Zahlen einsetzen, da die Prompt-Felder standardmäßig den Datentyp "String" haben!
        n = Integer.parseInt(eingabe2);
        r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        //String ausgabe = n; 
        JOptionPane.showMessageDialog(null, n);
        System.out.println("\nErgebnis: der größte gemeinsame Teiler dieser 2 Zahlen lautet: " + n + "\n");
    }
}
