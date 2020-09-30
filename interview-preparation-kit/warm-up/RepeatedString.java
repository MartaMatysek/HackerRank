import java.util.Scanner;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        long n = in.nextLong();

        long result = repeatedString(s, n);
        System.out.println(result);
    }

    static long repeatedString(String s, long n) {
        int sSize = s.length();
        long multiplication = n/sSize;
        long rest = n % sSize;
        String subS = s.substring(0, (int) rest);

        long result =
                s.length() > n ? count(subS) : (multiplication * count(s)) + count(subS);

        return result;
    }

    static long count(String s) {
        return s.chars().filter(ch -> ch == 'a').count();
    }
}
