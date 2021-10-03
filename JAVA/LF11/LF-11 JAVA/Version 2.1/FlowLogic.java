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
    
    private String dia = "";
    public static boolean auftrag; //true bedeutet: Kundeneingaben sind da!
    
    public static JOptionPane showJO(String iparam) {
        //String param = iparam;
        JOptionPane.showMessageDialog(null, iparam);
        return null;
    }
    
    public String startDialogue() {
        dia = JOptionPane.showInputDialog(null, "P1: Bitte Kriterium eingeben: ");
        if (dia.length() < 4) {
            switch (dia.length()) {
                case 0:
                    System.out.println("P1: leeres String-Objekt übergeben - Eingabe ungültig!");
                    break;
                case 1:
                    System.out.println("P1: Eingabe zu kurz!");
                    break;
                case 2:
                    System.out.println("P1: es fehlen noch 2 Zeichen!");
                    break;
                case 3:
                    System.out.println("P1: String-Objekt hat nur 3 Zeichen!");
                    break;
            }
        } else {
            System.out.println("P1: Erste Usereingabe: " + dia);
            concatStr(dia);
        }
        return null; 
    }
     
     public String concatStr(String iparam) {
        String param = iparam ; 
        param = param.concat(" | P1: Eingabe-String wurde hiermit ergänzt");
        showJO(param);
        method1(param);
        return param;
    }
      public String method1(String iparam) {
          String param = iparam; 
          param = param.replace(param, "P1: neuer Text - alte Eingabe wurde ersetzt!"); 
          showJO(param);
          method2(param); 
          return param;
      }
     
     public boolean method2(String iparam) {
          String param = iparam; 
          int leng = param.length(); 
          param = "P1: Länge des String-Objektes (=Anzahl der Zeichen): " + leng;
          showJO(param);
          auftrag = true;
          FlowLogic_Auftrag.proc(auftrag); 
          return auftrag;
     }
}
