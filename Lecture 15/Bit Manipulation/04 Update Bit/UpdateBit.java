// 1. Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)
// OR
// 1. Update the 3rd bit (position = 2) of a number n to 0. (n = 0101)

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        int n = 5;
        int pos = 1; // pos = 2; for 0 operation
        int bitMask = 1 << pos;

        if (operation == 1) {
            // Set Bit
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // Clear Bit
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
