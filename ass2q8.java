package lab2;
 import java.util.*;
public class ass2q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        
        int[] originalArray = new int[sizeOfArray];

      
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

       
        System.out.println("\nThe elements in the original array are:");
        displayArray(originalArray);

       
        System.out.print("\nEnter the position to divide the array: ");
        int dividePosition = scanner.nextInt();

    
        if (dividePosition < 1 || dividePosition > sizeOfArray - 1) {
            System.out.println("Invalid divide position. It should be between 1 and " + (sizeOfArray - 1) + ".");
        } else {
          
            int[] firstPart = new int[dividePosition];
            int[] secondPart = new int[sizeOfArray - dividePosition];

            for (int i = 0; i < dividePosition; i++) {
                firstPart[i] = originalArray[i];
            }

            for (int i = dividePosition; i < sizeOfArray; i++) {
                secondPart[i - dividePosition] = originalArray[i];
            }

           
            System.out.println("\nArray after division:");
            System.out.println("First Part:");
            displayArray(firstPart);
            System.out.println("Second Part:");
            displayArray(secondPart);

            
            checkAndDisplayDuplicates(firstPart);
            checkAndDisplayDuplicates(secondPart);
        }

   
        scanner.close();
    }

    private static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }

    private static void checkAndDisplayDuplicates(int[] array) {
        System.out.println("\nChecking for duplicate elements in the array:");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element found: " + array[i]);
                }
            }
        }
    }
}