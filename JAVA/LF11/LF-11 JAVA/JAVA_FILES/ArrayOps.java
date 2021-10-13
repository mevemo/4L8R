package tag10; 

//Array declaration: there are 3 ways to declar or initialize an Array: 
    //String[] array01 = {"","",""}; //direct adding of elements at declaration time
    //------------
    //String [] array02 = new String[12]; //size of array must be provided!
    //------------
    //String [] array03;        //declaration
    //array03 = new String[20]; //initialization
//------------
//Array ops: 
//Arrays have fixed length (size) - so to add new elements the following 2 principles need to be considered:  

//Principle I: copying & enlarging the original array, then adding new elements: 
    //1. declare a destination array then copy source array "srcArray" to "destArray": 
    //   int[] destArray = Arrays.copyOf(srcArray, srcArray.length + 1);

    //2. insert new element at specified address: 
    //   destArray[destArray.length - 1] = elementToAdd; 

//Principle II: using ArrayUtils Class: 
// int[] destArray = ArrayUtils.insert(2, srcArray, 77, 88, 99); //insert three elements in srcArray starting at index two


