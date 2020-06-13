package codeforces;

import java.util.Scanner;

public class C69AEquilibriumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfForces = sc.nextInt();
        int xForce=0,yForce=0,zForce=0;
        while(numberOfForces-->0){xForce+=sc.nextInt();yForce+=sc.nextInt();zForce+=sc.nextInt();}
        System.out.print(xForce==0&&yForce==0&&zForce==0?"YES":"NO");
    }
}
