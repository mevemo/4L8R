/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag04;

import java.util.Scanner;

/**
 *
 * @author arist
 */
public class Switch01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Monatszahl eingeben: ");
        int month = s.nextInt();;
        String monthstring="";
        switch(month) {
            case (1): monthstring = "Jan";
            break;
            case (2): monthstring = "Feb";
            break;
            case (3): monthstring = "Mar";
            break;
            case (4): monthstring = "Apr";
            break;
            case (5): monthstring = "Mai";
            break;
            case (6): monthstring = "Jun";
            break;
            case (7): monthstring = "Jul";
            break;
            case (8): monthstring = "Aug";
                 System.out.println("Monat: " + monthstring + ".\nHey, du hast in diesem Monat Geburtstag!");
            break;
            case (9): monthstring = "Sep";
            break;
            case (10): monthstring = "Oct";
            break;
            case (11): monthstring = "Nov";
            break;
            case (12): monthstring = "Dec";
            break;
            default: System.out.println("es gibt nur 12 Monate im Jahr!"); 
        }
    } 
}
