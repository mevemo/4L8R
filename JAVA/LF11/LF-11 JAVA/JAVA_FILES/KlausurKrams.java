package de.mevemo; // HIER BITTE ANPASSEN


import java.sql.SQLOutput;

public class KrausurKrams {


    static int smm (int a, int b){
        return a + b;
    }


    public static void main(String[] args) {

        /* hier entsteht mein hello world*/
        /*HelloWorld.helloWorld();
        NeuKram.gehAb();*/
/*        double x = 3 * Math.PI;
        System.out.println(x);*/
  /*      int i = 3;
        String s = "4";
        String text = s + i;
        System.out.println(text);
        int j = i / 2;
*/
     /*   double x = 3.9415;
        int n = (int) x;
        System.out.println(n);
        CollatzFolge.run();*/
        /*  int zahl1 = (int) "1234";*/


 /*       int c = 5;
        String res = "";
        res += c + ", ";
        res += c++ + ", ";
        res += c + ", ";
        res += ++c + ", ";
        System.out.println(res);
        int a;
        int b;
        int d;
        a=b=d=42;
        System.out.println(a);*/


        //DimiOne.runOne();

        //DimiTwo.runTwo();

       /* int i =1;
        do {
            if (i%2 == 0) continue;
            if (i == 5) break;
            System.out.println(i +" ");

        } while (true);*/

/*        System.out.println("Result:" + 3 * 5);
        System.out.println("Result:" + (3 + 5));*/

        // label 4 for loops
        /*pups:
        for (int i=0;i<10;i++){
            System.out.println("i is: " +  i);
            if (i == 4){
                continue pups;
            }
            System.out.println("i is not 4");
            if (i== 6){
                break pups;
            }*/

        // EINE ANDERE AUFGABE
        // Wie oft wird 2 als Teil der Ausgabe ausgegeben werden? / Antwort: 3 mal
        /*String [] table = {
                "aa", "bb", "cc"
        };
        for (String s: table) {
            int i = 0;
            while(i < table.length){
                System.out.println(s+ ": " + i);
                i++;
            }
        }*/

        // Was ist der erwartete Output von folgendem Code
        //Antwort: 5 : 5
        /*int a = 0, z = 10;
        while (a<z){
            a++;
            z--;
        }
        System.out.println(a + " : " + z);
        */

        //Frage 11
        // Was ist der erwartete Output von folgendem Code
        //Antwort: [green, red, yellow, cyan]

        /*ArrayList <String> colors = new ArrayList<>();

        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3, "cyan");

        System.out.println(colors);*/

        // Was ist der erwartete Output von folgendem Code
        // Antwort: a. 2 4 6 8
       /* int arr1[] = {2, 4, 6, 8};
        int arr2[] = {1,3,5,7,9};
        arr2=arr1;
        for (int a : arr2){
            System.out.print(a + " ");
        }*/

        // Was ist der erwartete Output von folgendem Code
        //Antwort: a. 4, 34, 234, 1234
       /* for (int row = 4; row > 0; row--) {
            int col = row;
            while (col <= 4) {
                System.out.print(col);
                col++;
            }
            System.out.println();
        }*/

        // Was ist der erwartete Output von folgendem Code
        // Antwort: d. Student student1 = new Student()
        /*Student student1 = new Student();
        student1.display();*/

        // Was ist der erwartete Output von folgendem Code
        // Antwort: c: squarecircle...
/*      int num = 3;
        if (!(num > 3)) {
            System.out.print("square");
        }{
            System.out.print("circle");
        }
        System.out.print("...");
*/

        // Was ist der erwartete Output von folgendem Code
        // Antwort: d int sum(int first, int second){return a+b;}

        // System.out.println(smm(1,2));


        //Welche Zeile wird den höchsten Wert ausgeben
/*        System.out.println(2 + 4 * 9 - 3);
        System.out.println((2 + 4) * 9 - 3); // line 2/ der hier isses
        System.out.println(2 + (4 * 9) - 3);
        System.out.println(2 + 4 * (9 - 3));
        System.out.println((2 + 4 * 9) - 3);
*/


        //
/*        int value = 33;
        if (value >= 0){
            if (value != 0)
                System.out.print("The ");
            else
                System.out.print("quick ");
            if (value < 10)
                System.out.print("brown ");
            else if (value > 30)
                System.out.print("fox ");
            else if (value < 50)
                System.out.print("jumps ");
            else if (value < 10)
                System.out.print("over ");
            else
                System.out.print("The ");
            if (value > 10)
                System.out.print("lazy ");

        }   else {
            System.out.print("dog ");
        }
        System.out.println("...");
*/


    }


}
