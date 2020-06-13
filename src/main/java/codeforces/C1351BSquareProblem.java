package codeforces;

import java.util.Scanner;

public class C1351BSquareProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfCases = s.nextInt();
        for (int i = 0; i < numberOfCases; i++) {
            int rect1dimension1 = s.nextInt();
            int rect1dimension2 = s.nextInt();
            int rect2dimension1 = s.nextInt();
            int rect2dimension2 = s.nextInt();
            if ((rect1dimension1 == rect2dimension1 && (rect1dimension2 + rect2dimension2 == rect1dimension1))
                    || (rect1dimension1 == rect2dimension2 && (rect1dimension2 + rect2dimension1 == rect2dimension2))
                    || (rect1dimension2 == rect2dimension1 && (rect1dimension1 + rect2dimension2 == rect2dimension1))
                    || (rect1dimension2 == rect2dimension2 && (rect1dimension1 + rect2dimension1 == rect2dimension2)))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}