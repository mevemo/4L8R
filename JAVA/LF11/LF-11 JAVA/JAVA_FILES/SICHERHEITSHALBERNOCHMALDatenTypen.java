public class DatenTypen {
    
    /**
     * 
     *   
     */
    public static void main(String [] params) {
        System.out.println("\n1: Deklarieren der Variablen für primitive Datentypen");
        
        boolean myFirstBoolean; // 1 Bit
        myFirstBoolean         = true;
        char myFirstCharacter  = '\u006A'; // = Unicode! 16 Bit (2 Byte)
        char char_standardwert = '\u0000'; //
        byte myFirstByte       = 123; // 8 Bit (1 Byte)
        short myFirstShort     = -12321; // 16 Bit (2 Byte)
        int myFirstInteger     = 1_234_567_890; // 32 Bit (4 Byte)
        long myFirstLong       = -9_223_372_036_854_775_808L; // 64 Bit (8 Byte)
        float myFirstFloat     = 3.01f; // 32 Bit (4 Byte)
        double myFirstDouble   = 16_394_000_000_000.987654321; // 64 Bit (8 Byte)
 
        System.out.println("2: Ausgabe der Werte \n");
        
        System.out.println("myFirstBoolean:   " + myFirstBoolean);
        System.out.println("myFirstCharacter: " + myFirstCharacter);
        
    }
}
