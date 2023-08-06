// Max and Min in an array

import java.util.Scanner;

public class Lecture10_5 {

    public static int getMax(int arr[], int n) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            maxi = Math.max(maxi, arr[i]);

            // if (arr[i] > maxi) {
            // maxi = arr[i];
            // }
        }
        return maxi;

    }

    public static int getMin(int arr[], int n) {
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            mini = Math.min(mini, arr[i]);

            // if (arr[i] < mini) {
            // mini = arr[i];
            // }
        }
        return mini;
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
