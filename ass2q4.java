package lab2;
import java.util.Scanner;

public class ass2q4{
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

     
        System.out.print("\nEnter the element to be searched: ");
        int elementToSearch = scanner.nextInt();

        boolean found = false;
        int index = -1;

     
        for (int i = 0; i < sizeOfArray; i++) {
            if (myArray[i] == elementToSearch) {
                found = true;
                index = i;
                break;
            }
        }

        
        if (found) {
            System.out.println("\nElement " + elementToSearch + " found at index " + index);
        } else {
            System.out.println("\nElement " + elementToSearch + " not found in the array.");
        }

       
        scanner.close();
    }
}
