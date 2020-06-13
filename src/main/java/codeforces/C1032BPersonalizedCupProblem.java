package codeforces;

import java.util.Scanner;

public class C1032BPersonalizedCupProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int nums = (int) Math.ceil(s.length / 20.0);
        int lih = nums * 20 - s.length;
        int stolb = 20 - lih / nums;
        int li = nums * stolb - s.length;
        System.out.println(nums + " " + stolb);
        int pos = 0;
        for (int i = 0; i < nums; i++) {
            for (int j = 0; j < stolb; j++) {
                if (j == stolb - 1 && (nums - i) <= li) {
                    System.out.print("*");
                } else
                    System.out.print(s[pos++]);
            }
            System.out.println();
        }
    }
}
