package codeforces;

import java.util.Scanner;

public class C1169ACircleMetroProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int x = s.nextInt();
        int b = s.nextInt();
        int y = s.nextInt();
        while (true) {
            if (a == b) {
                System.out.println("YES");
                break;
            } else if (a == x || b == y) {
                System.out.println("NO");
                break;
            } else {
                a++;
                b--;
            }
            if (a == n + 1) {
                a = 1;
            }
            if (b == 0) {
                b = n;
            }
        }
    }
}