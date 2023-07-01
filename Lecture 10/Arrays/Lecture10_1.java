import java.util.*;

public class Lecture10_1 {
    public static void main(String[] args) {
        int[] marks = new int[3];

        // Another way to declare an array
        // int marks[] = new int[3];

        marks[0] = 98;
        marks[1] = 96;
        marks[2] = 94;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}