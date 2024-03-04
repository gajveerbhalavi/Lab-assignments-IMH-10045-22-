package lab2;

import java.util.Scanner;

public class ass2q7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

      
        int[] inputArray = new int[sizeOfArray];

        
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            inputArray[i] = scanner.nextInt();
        }

        
        System.out.println("\nThe elements in the original array are:");
        displayArray(inputArray);


        int[] evenArray = getEvenElements(inputArray);
        int[] oddArray = getOddElements(inputArray);

       
        System.out.println("\nThe even elements in the array are:");
        displayArray(evenArray);

        
        System.out.println("\nThe odd elements in the array are:");
        displayArray(oddArray);

       
        scanner.close();
    }

    private static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }

    private static int[] getEvenElements(int[] array) {
        int countEven = 0;

      
        for (int element : array) {
            if (element % 2 == 0) {
                countEven++;
            }
        }

      
        int[] evenArray = new int[countEven];
        int index = 0;

        
        for (int element : array) {
            if (element % 2 == 0) {
                evenArray[index++] = element;
            }
        }

        return evenArray;
    }

    private static int[] getOddElements(int[] array) {
        int countOdd = 0;

        
        for (int element : array) {
            if (element % 2 != 0) {
                countOdd++;
            }
        }

      
        int[] oddArray = new int[countOdd];
        int index = 0;

        
        for (int element : array) {
            if (element % 2 != 0) {
                oddArray[index++] = element;
            }
        }

        return oddArray;
    }
}
