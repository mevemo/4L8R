package tag01;

public class Zahlenreihe {
    public static void main(String [] params) {
         	String ausgabe = " ";
	System.out.println("mit While-Schleife..");
	int z = 0;
	while (z < 5) {
 		ausgabe += z + " "; //String-Objekt! 
		System.out.println(ausgabe);
		z++; 
      	}
    }
    
}
