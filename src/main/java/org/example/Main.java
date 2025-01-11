package org.example;

import java.util.stream.*;
import java.util.*;
import java.io.*;


/***
 * 알고리즘 수업 - 피보나치 수 1
 */
class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int f1;

    public static int f2;

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(f1) + " " + String.valueOf(f2));
        bw.flush();
    }

    public static void func1(int num){
        if (num == 1 || num == 2) {
            f1 = f1 +1;
            return;
        }

        func1(num-1);
        func1(num - 2);
    }

    public static void func2(int num) {
        if (num == 1 || num == 2) {
            return;
        }

        for (int i = 3; i <= num; i++) {
            f2 = f2 + 1;
        }
    }

    public static void solve() {
        func1(n);
        func2(n);
    }


    public static void main(String[] args) throws IOException {

        input();
        solve();
        output();

    }



}




