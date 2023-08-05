// Max and Min in an array

import java.util.Scanner;

public class Lecture10_5 {
    public static int getMax(int arr[], int n) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static int getMin(int arr[], int n) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i = 0; i < size; i++) {
        // System.out.print(arr[i] + " ");
        // }

        System.out.println("Maximum value is: " + getMax(arr, size));
        System.out.println("Minimum value is: " + getMin(arr, size));
    }
}
