package Wettrennen;

public class Wettrennen {
	private static int rennDauer = 60;
	private static int vorSprung = 240;
	static Fahrzeug fahrrad 		= new Fahrrad(20);
	static Fahrzeug auto 			= new Auto("Auto", 140, 0, 150, 4);
	static Fahrzeug rennwagen 		= new Rennwagen("Rennwagen", 220, 0, 200 ,4 );
	static Fahrzeug krankenwagen 	= new Krankenwagen("Krankenwagen", 140, 0 , 80, 4);
	static Fahrzeug[] teilnehmer = {fahrrad, auto, rennwagen, krankenwagen};
	
	
	public static void main(String[] args) {

		fahrrad.bewege(vorSprung);
				
		run();
		status();
	}
	
	private static void status() {
		for (Fahrzeug x : teilnehmer) {
			System.out.println("hier sollte was passieren...");
		}
		
	}

	public static void run() {
		for(Fahrzeug teil:teilnehmer) {
			teil.bewege(rennDauer);
		}
	}
	
}
