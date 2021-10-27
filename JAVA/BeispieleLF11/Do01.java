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
public class Do01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1, n = 5;

        // do...while loop from 1 to 5
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
