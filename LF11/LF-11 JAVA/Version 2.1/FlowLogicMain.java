package tag08;
import java.util.Calendar; 

/**
 *
 * @author arist
 */
public class FlowLogicMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         System.out.println("Aktuelles Modelljahr: " + Year.getCurrYear());
          
         FlowLogic fl = new FlowLogic();
         fl.startDialogue(); 
//        
//        FlowLogic_Auto auto = new FlowLogic_Auto();
//        auto.activate(); 
//        
//        Abschluss abs = Abschluss(); 
//        abs.summary(); 
        
//        String ok = "Vielen Dank, Ihr Auto bekommt folgende Ausstattung: "; 
//        
//        for (int i : arr) { 
//            System.out.println(i); 
//        }
//        
//        fl.showJO(parm)
    }
    
}
