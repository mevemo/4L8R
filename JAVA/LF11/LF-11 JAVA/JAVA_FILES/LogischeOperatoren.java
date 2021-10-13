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
/*
* Logische Operatoren in Java.
* "S-C-E" = "short circuit evaluation" (schnelle Auswertung). 
*/
public class LogischeOperatoren{
 public static void main(String[] args) {
  
  boolean a = true, b = true, c = false;
  boolean ergebnis;
 
  System.out.println("\na = " + a);
  System.out.println("b = " + b);
  System.out.println("c = " + c);
 
  ergebnis = !a;
  System.out.println("\nNicht a:   !a = " + ergebnis);
 
  ergebnis = a ^ b;
  System.out.println("\nExklusiv Oder:   a ^ b = " + ergebnis);
 
  ergebnis = a ^ c;
  System.out.println("Exklusiv Oder:   a ^ c = " + ergebnis);
 
  ergebnis = a & b;
  System.out.println("\nUnd:   a & b = " + ergebnis);
 
  ergebnis = a & c;
  System.out.println("Und:   a & c = " + ergebnis);
 
  ergebnis = a | b;
  System.out.println("\nOder:      a | b = " + ergebnis);
 
  ergebnis = a | c;
  System.out.println("Oder:      a | c = " + ergebnis);
 
  ergebnis = (!a) | c;
  System.out.println("Oder:   (!a) | c = " + ergebnis);
 
  ergebnis = a && b;
  System.out.println("\nUnd (S-C-E):   a && b = " + ergebnis);
 
  ergebnis = a && c;
  System.out.println("Und (S-C-E):   a && c = " + ergebnis);
 
  ergebnis = a || b;
  System.out.println("\nOder (S-C-E):      a || b = " + ergebnis);
 
  ergebnis = a || c;
  System.out.println("Oder (S-C-E):      a || c = " + ergebnis);
 
  ergebnis = (!a) || c;
  System.out.println("Oder (S-C-E):   (!a) || c = " + ergebnis);
 
 }
}