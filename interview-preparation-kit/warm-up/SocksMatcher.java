import java.util.Arrays;
import java.util.Scanner;

public class SocksMatcher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var howMany = in.nextInt();
        int colors[] = new int[howMany];
        for(int i = 0; i < howMany; i++){
            colors[i] = in.nextInt();
        }

        System.out.println(sockMerchant(howMany, colors));
    }

    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int pairs = 0;

        for (int i = 0; i < n - 1; i++) {
            if (ar[i] == ar[i+1]) {
                pairs++;
                i++;
            }
        }

        return pairs;
    }
}
