import java.util.Scanner;

class Lecture11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // outter lop for rows
        for (int i = 0; i < rows; i++) {

            // inner loop for cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // output
        // outter lop for rows
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}