package codeforces;

import java.io.*;
import java.util.*;

public class C131ACapsLockProblem {
    public static char[] algorithm(char[] input) {
        char[] output = new char[input.length];
        if (Character.isUpperCase(input[0])) {
            output[0] = Character.toLowerCase(input[0]);
        } else {
            output[0] = Character.toUpperCase(input[0]);
        }
        for (int i = 1; i < input.length; i++) {
            if (Character.isUpperCase(input[i])) {
                output[i] = Character.toLowerCase(input[i]);
            } else {
                return input;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        out.println(new String(algorithm(sc.next().toCharArray())));
        out.close();
    }

    public static String capitalize(String str) {
        if (str == null) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}

