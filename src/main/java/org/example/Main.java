package org.example;


import java.util.*;

class Main {

    public static int t;

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        solve();

    }

    public static void solve() {
        t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();

            int q = c/ 25;
            c = c%25;
            int d =  c/10;
            c = c%10;
            int n =  c/5;
            c = c%5;
            int p = c/1;
            c = c%1;

            System.out.println(q + " " + d + " " + n + " " + p);
        }

    }
}


