import java.util.Scanner;

public class CountingValleys {

    private static final char DOWN = 'D';
    private static final char UP = 'U';

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String path = in.nextLine();

        int result = countingValleys(path);
        System.out.println(result);
    }

    public static int countingValleys(String path) {
        int valleyes = 0;

        int level = 0;
        for (char c: path.toCharArray()) {
            if (c == UP) ++level;
            if (c == DOWN) --level;

            if (c == UP && level == 0) {
                valleyes++;
            }
        }

        return valleyes;
    }
}
