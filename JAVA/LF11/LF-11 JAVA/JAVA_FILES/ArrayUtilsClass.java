public class ArrayUtilsClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray= new int[12];
        intArray = {0,1,2,3,4,5,6,7,8};
        int[] intArrayNew = Arrays.copyOf(intArray, intArray.length + 4); 
        
    }
    
}
