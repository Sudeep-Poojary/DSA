// Print x^n (Stack height = n)

public class Lecture17_6 {

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        int xPower_nm1 = calcPower(x, n - 1);
        int xPower_n = x * xPower_nm1;
        return xPower_n;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
