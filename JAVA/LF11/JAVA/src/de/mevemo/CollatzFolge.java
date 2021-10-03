package de.mevemo;

import javax.swing.JOptionPane;

public class CollatzFolge {
    public static void run() {

        int number = 17;
        int count = 0;
        int groesste;
        groesste = number;

        while (number != 1) {
            if (number >= groesste) {
                groesste = number;
            }
            if (number % 2 == 0) {
                number = number / 2;
            }
            else {
                number = number * 3 + 1;
                count++;
            }
            count++;
        }
        JOptionPane.showMessageDialog(null, "Ausgabe count: " + count);
        JOptionPane.showMessageDialog(null, "Ausgabe groesste: " + groesste);
    }

}
