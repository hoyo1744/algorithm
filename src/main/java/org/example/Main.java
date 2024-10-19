package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static int[][] dp = new int[10][10];


    public static void main(String[] args) throws IOException {


        for (int i = 0; i < 10; i++) {
            Arrays.fill(dp[i], 0);
        }

        int n = Integer.parseInt(br.readLine());

        dp[1][1] = 1;

        for (int i = 2; i <= n+1; i++) {
            for (int j = 1; j <= n+1; j++) {
                if (j == 1 || j == n+1) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }


        int result = 0;

        for (int i = 1; i <= n + 1; i++) {
            result += dp[n+1][i];
        }


        bw.write(String.valueOf(result));

        bw.flush();


    }
}

