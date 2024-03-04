package lab2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ass2q5 {
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

       
        findAndPrintDuplicates(myArray);


        scanner.close();
    }

    private static void findAndPrintDuplicates(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

       
        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

   
        boolean duplicatesFound = false;
        System.out.println("\nDuplicate elements and their frequency:");

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element " + entry.getKey() + ": " + entry.getValue() + " times");
                duplicatesFound = true;
            }
        }

        if (!duplicatesFound) {
            System.out.println("No duplicate elements found in the array.");
        }
    }
}
