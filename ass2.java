package lab2;

import java.util.Scanner;

public class ass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

       
        int[] Array = new int[sizeOfArray];

       
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < sizeOfArray; i++) {
            Array[i] = scanner.nextInt();
        }

        
        System.out.println("\nThe elements in the array are:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println( Array[i]);
        }

        
        System.out.print("\nEnter the position for insertion: ");
        int position = scanner.nextInt();

        
        if (position < 1 || position > sizeOfArray + 1) {
            System.out.println("Invalid position for insertion.");
        } else {
            System.out.print("Enter the element to be inserted: ");
            int element = scanner.nextInt();

           
            for (int i = sizeOfArray - 1; i >= position - 1; i--) {
                Array[i + 1] = Array[i];
            }

            
            Array[position - 1] = element;

            
            System.out.println("\nArray after insertion:");
            for (int i = 0; i < sizeOfArray + 1; i++) {
                System.out.println( Array[i]);
            }
        }

        
        scanner.close();
    }
}

