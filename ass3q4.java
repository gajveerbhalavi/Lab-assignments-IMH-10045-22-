package lab2.lab3;

import java.util.*;
public class ass3q4 {

    public static String intolowercase(String[] inputarray){
        return inputarray[0].toLowerCase();
    }
    public static int calculatestringlength(String[] inputarray){
        return inputarray[0].length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String[] inputarray = {scanner.nextLine()};
        String lowercasestring = intolowercase(inputarray);
        int stringlength = calculatestringlength(inputarray);
        System.out.println("Original String: " + inputarray[0]);
        System.out.println("Lowercase String: " + lowercasestring);
        System.out.println("Total String length: " + stringlength);
    }
    
}
