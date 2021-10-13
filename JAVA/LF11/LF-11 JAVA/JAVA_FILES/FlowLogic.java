/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag08;

import javax.swing.JOptionPane;

/**
 *
 * @author arist
 */
public class FlowLogic {

    /**
     * @param args the command line arguments
     */
    private static String dia = "";
    
    public static void main(String[] args) {
        dia = JOptionPane.showInputDialog(null, "Bitte Kriterium eingeben: ");
        if (dia.length() < 4) {
            switch (dia.length()) {
                case 0:
                    System.out.println("leeres String-Objekt übergeben - Eingabe ungültig!");
                    break;
                case 1:
                    System.out.println("Eingabe zu kurz!");
                    break;
                case 2:
                    System.out.println("es fehlen noch 2 Zeichen!");
                    break;
                case 3:
                    System.out.println("Stringobjekt hat nur 3 Zeichen!");
                    break;
            }
        } else {
            System.out.println("Usereingabe: " + dia);
            concatStr(dia);
        }
    }

     public static String concatStr(String iparam) {
        String param = iparam ; 
        param = param.concat(" | Eingabe-String wurde hiermit ergänzt");
        JOptionPane.showMessageDialog(null, param);
        method1(param);
        return param;
    }
      public static String method1(String iparam) {
          String param = iparam; 
          param = param.replace(param, "neuer Text - alte Eingabe wurde ersetzt!"); 
          JOptionPane.showMessageDialog(null, param);
          method2(param); 
          return param;
      }
     
     public static int method2(String iparam) {
          String param = iparam; 
          int leng = param.length(); 
          JOptionPane.showMessageDialog(null, leng);
          return leng;
        }
    }
