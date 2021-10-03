/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag06;

/**
 *
 * @author arist
 */
public class BruchStart {
  public static void main(String[] args) {
    
    Bruch bru = new Bruch(25, 7); 
    System.out.println(bru);
   
    //--------------------------------------
    bru.kuerze();    
    System.out.println(bru);    
    //-------------------------------------
    bru.erweitere(3);
    System.out.println(bru);
    //-------------------------------------
    
    System.out.println("Faktorberechnung durch ggT: " + bru.ggT()); 
    //-------------------------------------
    
  }

}