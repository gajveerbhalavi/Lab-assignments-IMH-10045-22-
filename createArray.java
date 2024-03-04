
package lab2;
import java.util.Scanner;

public class createArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] Array = new int[sizeOfArray];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            Array[i] = scanner.nextInt();
        }
        System.out.print("\nThe elements in the array are:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(Array[i]);
        }
    }
}

