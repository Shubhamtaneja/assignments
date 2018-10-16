class GenericArray 
{
  
  public static <E> void printArray(E[] arr) {
    
    for (E element : arr)
      System.out.println(element);

    
  }

  public static void main(String args[]) {

    Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
    Character[] characterArray = { 'J', 'A', 'V', 'A'};

    System.out.println("Integer array");
    printArray(integerArray);

    System.out.println("doublearray ");
    printArray(doubleArray); 
	
    System.out.println("array character array ");
    printArray(characterArray); 
  } 
}