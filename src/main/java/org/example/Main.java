
package org.example;

// 계단 오르기
import java.util.*;
import java.util.stream.*;
import java.io.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[][] dp = new int[305][3];

    public static int n;

    public static int[] arr = new int[305];

    public static void main(String[] args) throws IOException {

        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int v = Integer.parseInt(br.readLine());
            arr[i] = v;
        }
    }

    public static void solve() {
        dp[1][1] = arr[1];
        dp[2][1] = arr[2];
        dp[2][2] = arr[1] + arr[2];


        for (int i = 3; i <= n; i++) {
                dp[i][1] = Math.max(dp[i-2][2], dp[i-2][1]) + arr[i];
                dp[i][2] = dp[i-1][1] + arr[i];
        }
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(Math.max(dp[n][1], dp[n][2])));
        bw.flush();
    }

}