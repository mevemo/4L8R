/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag04;

/**
 *
 * @author arist
 */
public class Switchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //switch arbeitet mit Datentypen byte, short, char und int 
        int month = 8;
        String monthString;
        monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println(monthString);
    }
    
}
