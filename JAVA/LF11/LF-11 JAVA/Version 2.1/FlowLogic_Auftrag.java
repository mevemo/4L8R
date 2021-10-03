package tag08;

/**
 *
 * @author arist
 */
public class FlowLogic_Auftrag { 
    
    public static void proc (boolean iparam) {
        String txt = ""; 
        boolean auftrag = iparam; 
        if (auftrag) { 
            FlowLogic_Auto auto = new FlowLogic_Auto();
            txt = "P2: Auftrag eingegangen, Auto wird produziert!";
            FlowLogic.showJO(txt);
        } else { 
            txt = "P2: Auftrag noch nicht eingegangen, Prozess kann nicht gestartet werden!";  
            FlowLogic.showJO(txt);
        }
    }
    
}
