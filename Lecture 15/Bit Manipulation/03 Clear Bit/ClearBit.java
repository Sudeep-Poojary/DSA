// Clear the 3rd bit (position = 2) of a number n. (n = 0101)

public class ClearBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;

        System.out.println(newNumber);
    }
}
