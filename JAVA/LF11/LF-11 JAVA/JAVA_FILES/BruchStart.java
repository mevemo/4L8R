public class BruchStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bruch bru = new Bruch(36, 346);
        System.out.println(bru);
        bru.kuerze();
        System.out.println(bru);
        bru.erweitere(2);
        System.out.println(bru);

        //bru.ggT();

    }

}