/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag03;

/**
 *
 * @author arist
 */
public class String01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //String txt = new String();
        String txt = "JAVA-IST-TOLL"; 
        String teiltxt; //Standardwert = NULL 
        teiltxt = txt.substring(4, txt.length()); 
        System.out.println(txt);
        System.out.println(teiltxt);
        System.out.println(txt.length());
        
        
    }
    
}
