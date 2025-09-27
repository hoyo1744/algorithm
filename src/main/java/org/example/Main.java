
package org.example;

import java.util.*;
import java.io.*;
import java.util.Collections.*;

public class Main {

    public static int n;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result;

    public static int R = 1;

    public static int G = 2;

    public static int B = 3;

    public static int[][] dp = new int[5][1005];

    public static int[][] arr = new int[5][1005];




    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);

            for (int j = 1; j <= 3; j++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void solve() throws IOException {

        dp[R][1] = arr[R][1];
        dp[G][1] = arr[G][1];
        dp[B][1] = arr[B][1];

        for (int i = 2; i <= n; i++) {
            dp[R][i] = Math.min(dp[G][i-1], dp[B][i-1]) + arr[R][i];
            dp[G][i] = Math.min(dp[R][i-1], dp[B][i-1]) + arr[G][i];
            dp[B][i] = Math.min(dp[R][i-1], dp[G][i-1]) + arr[B][i];
        }

        result = Math.min(Math.min(dp[R][n], dp[G][n]), dp[B][n]);
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }






}