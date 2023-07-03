// Q. Take an arrray as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.Scanner;

public class Lecture10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input
        System.out.println("Enter each element of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be found: ");
        int x = sc.nextInt();

        // Output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Number " + x + " is present in the arrray at index " + i);
            }
        }
    }
}
