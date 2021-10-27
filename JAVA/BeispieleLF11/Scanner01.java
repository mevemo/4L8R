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
public class Scanner01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Integer-Zahl einegben: ");
        int a;
        a = s1.nextInt();
        System.out.println("eingegebene Zahl lautet: " + a);
    }

}
