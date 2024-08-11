package org.example;


import java.util.Scanner;

class Main {

    public static int a;

    public static int b;

    public static int c;

    public static int d;

    public static int e;

    public static int f;

    public static Scanner sc = new Scanner(System.in);

    public static int x;

    public static int y;
    public static void main(String[] args) {
        input();
        solve();
        output();
    }

    public static void input() {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
    }

    public static void solve() {

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (i * a + j * b == c && i * d + j * e == f) {
                    x= i;
                    y= j;
                    break;
                }
            }
        }



    }

    public static void output() {
        System.out.println(x + " " + y);

    }
}



