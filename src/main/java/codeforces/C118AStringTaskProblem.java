package codeforces;

import java.util.Scanner;

public class C118AStringTaskProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(new Scanner(System.in).nextLine().toLowerCase().replaceAll("[aeiouy]","").replaceAll(".",".$0"));
    }
}
