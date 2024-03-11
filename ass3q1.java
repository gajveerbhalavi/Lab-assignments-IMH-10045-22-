package lab2.lab3;

import java.util.Scanner;

public class ass3q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape: ");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Square");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Rectangle
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                calculateArea(length, width);
                calculatePerimeter(length, width);
                break;

            case 2:
                // Circle
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                calculateArea(radius);
                calculateCircumference(radius);
                break;

            case 3:
                // Square
                System.out.print("Enter side length of the square: ");
                double sideLength = scanner.nextDouble();
                calculateArea(sideLength);
                calculatePerimeter(sideLength);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method Overloading for Rectangle
    private static void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    private static void calculatePerimeter(double length, double width) {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    
    private static void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    private static void calculateCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }

   
    private static void calculateArea(double sideLength) {
        double area = sideLength * sideLength;
        System.out.println("Area of the square: " + area);
    }

    private static void calculatePerimeter(double sideLength) {
        double perimeter = 4 * sideLength;
        System.out.println("Perimeter of the square: " + perimeter);
    }
}
