package codeforces;
import java.util.*;

public class C1ATheaterSquareProblem {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        long n=s.nextInt(), m=s.nextInt(),a=s.nextInt();
        System.out.println(((n+a-1)/a)*((m+a-1)/a));
    }
}
