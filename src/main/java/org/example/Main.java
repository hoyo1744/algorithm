package org.example;


import java.util.Scanner;

class Main {

    public static Scanner sc = new Scanner(System.in);

    public static int v = 0;

    public static int a = 0;

    public static int b = 0;

    public static int result = 0;
    public static void main(String[] args) {

        input();
        solve();
        output();
    }

    public static void solve() {

        result = (v - b) / ( a- b);

        int remain = ( v - b) % ( a- b);
        if (remain == 0) {
            result = (v - b) / (a - b);
        } else {
            result = (v - b) / (a - b) + 1;

        }

    }

    public static void input() {
        a = sc.nextInt();
        b = sc.nextInt();
        v = sc.nextInt();
    }

    public static void output() {
        System.out.println(result);
    }

}


