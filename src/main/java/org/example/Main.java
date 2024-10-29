package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static long[][] dp = new long[32][32];



    public static void main(String[] args) throws IOException{


        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();

            StringTokenizer st = new StringTokenizer(str);
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            for (int j = 1; j <= n; j++) {
                Arrays.fill(dp[j], 0);
            }

            for (int j = 1; j <= n; j++) {
                dp[j][0] = 1;
                dp[j][1] = j;
                dp[j][j] = 1;
            }

            for (int j = 2; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    dp[j][k] = dp[j-1][k-1] + dp[j-1][k];
                }
            }


            bw.write(String.valueOf(dp[n][m])+"\n");
        }
        bw.flush();





    }




}


