// Array input 

import java.util.Scanner;

public class Lecture10_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("--------------------");

        // Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("--------------------");

        // Output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
