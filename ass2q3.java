package lab2;

import java.util.Scanner;

public class ass2q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

       
        int[] myArray = new int[sizeOfArray];

        
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        
        System.out.println("\nThe elements in the array are:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Element " + (i + 1) + ": " + myArray[i]);
        }

      
        System.out.print("\nEnter the index position for deletion: ");
        int loc = scanner.nextInt();

       
        if (loc < 1 || loc > sizeOfArray) {
            System.out.println("Invalid index position for deletion.");
        } else {
           
            for (int i = loc - 1; i < sizeOfArray - 1; i++) {
                myArray[i] = myArray[i + 1];
            }

           
            sizeOfArray--;

            
            System.out.println("\nArray after deletion:");
            for (int i = 0; i < sizeOfArray; i++) {
                System.out.println("Element " + (i + 1) + ": " + myArray[i]);
            }
        }

       
        scanner.close();
    }
}
