package de.mevemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HelloWorld {
    public static void helloWorld() {
        long result;
        String res;

        result = gcdEuclid(15, 25);
        System.out.println("MOIN MOIN UND HALLO");
        String str = "Hello again my friend:";
        res = disemvowel(str);
        System.out.println(res);
    }

    public static long gcdEuclid (long x, long y) {
        while ( y != 0 ) {
            long z = x % y;
            x = y;
            y = z;
        }
        return x;
    }

    public static String disemvowel(String str) {
            String temp[] = str.split("");
              List<String> resList = new ArrayList<String>();
              resList = Arrays.asList(temp);

            for (String i: resList) {

                if( i == "e") {
                  System.out.println(i);
                  resList.remove(i);
                }
            }
            String listString = String.join("", resList);
            return listString;
    }
}