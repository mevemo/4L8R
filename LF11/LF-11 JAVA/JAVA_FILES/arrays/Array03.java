package tag09;
class Array03 {
    public static void main(String[] args) {
        String[] source = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] destination = java.util.Arrays.copyOfRange(source, 2, 9);        
        for (String coffee : destination) {
            System.out.print(coffee + "\n ");           
        }            
    }
}
