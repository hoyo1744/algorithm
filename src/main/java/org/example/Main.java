
package org.example;

// 2xN 타일링

import java.util.*;
import java.util.stream.*;
import java.io.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int result;

    public static int[] dp = new int[1005];

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(dp[n]));
        bw.flush();
    }

    public static void solve() {
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%10_007;
        }
    }


    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();

    }



}