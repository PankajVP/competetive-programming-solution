package codeforces;

import java.util.Scanner;

public class C1163AGroupsProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfPeople = s.nextInt();
        int peopleLeft = s.nextInt();
        if (peopleLeft == 0 || peopleLeft == 1)
            System.out.println(1);
        else if (numberOfPeople - peopleLeft == 0)
            System.out.println(0);
        else System.out.println(Math.min(numberOfPeople - peopleLeft, peopleLeft));
    }
}