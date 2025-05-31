
package org.example;

// 피보나치함수

import java.util.stream.*;
import java.util.*;
import java.io.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int t;

    public static int n;

    public static int result;

    public static int dp[][] = new int[45][2];

    public static void init() {
        result = 0;
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(dp[n][0]) + " " + String.valueOf(dp[n][1]) + "\n");
        bw.flush();
    }

    public static void solve() {


        dp[0][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

    }


    public static void main(String[] args) throws IOException {

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            init();
            n = Integer.parseInt(br.readLine());
            solve();
            output();
        }
    }



}