/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag09;

/**
 *
 * @author arist
 */
public class Array01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //String [] cars; 
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("\n-------------\n");

        for (String i : cars) {     
            //ACHTUNG: i muss bei for-each-loop stets vom selben Datentyp wie der Array sein! 
            //read like: "for each String element called i in array cars, print out the value of i" 
            System.out.println(i);   
        }
        
        System.out.println("\n-------------\n");
        
// multi-dimensional array: 
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7
    }

}
