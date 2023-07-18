
public class Lecture13_1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set Char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert char at index 0
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete extra 'n' from the string
        sb.delete(2, 3);
        System.out.println(sb);

        // append function
        StringBuilder sB = new StringBuilder("h");
        sB.append("e");
        sB.append("l");
        sB.append("l");
        sB.append("o");
        System.out.println(sB);
    }
}
