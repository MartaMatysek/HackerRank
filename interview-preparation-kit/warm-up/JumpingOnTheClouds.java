import java.util.Scanner;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        int result = jumpingOnClouds(n, c);
        System.out.println(result);
    }

    static int jumpingOnClouds(int n, int[] c) {
        int steps = 0;
        int i = 0;
        while(i < n - 1) {
            if (i + 2 < n && c[i+2] == 0) {
                i = i + 2;
            } else {
                i++;
            }
            steps++;

        }
        return steps;
    }
}
