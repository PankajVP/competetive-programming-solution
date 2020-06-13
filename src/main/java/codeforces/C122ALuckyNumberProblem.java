package codeforces;

import java.util.Scanner;

public class C122ALuckyNumberProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = Integer.parseInt(s);
        System.out.println(s.matches("[7|4]+" ) || (n%7 == 0 || n%4 == 0 || n%47 == 0)?"YES":"NO");
    }
}
