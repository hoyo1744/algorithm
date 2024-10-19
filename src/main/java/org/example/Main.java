package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[] dp = new int[20];

    public static void main(String[] args) throws IOException{

        Arrays.fill(dp, 0 );

        int n = Integer.parseInt(br.readLine());

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i-1] * i;
        }

        bw.write(String.valueOf(dp[n]));

        bw.flush();



    }

}

