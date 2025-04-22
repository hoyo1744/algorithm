package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int[] dp = new int[1000005];

    public static int solve(int num) {

        if (num == 1) {
            return 0;
        }

        int ret = dp[num];
        if (ret != Integer.MAX_VALUE) {
            return ret;
        }


        if (num % 3 == 0) {
            ret = Math.min(ret, solve(num/3) + 1);
        }
        if (num % 2 == 0) {
            ret = Math.min(ret, solve(num/2) + 1);
        }

        ret = Math.min(ret, solve( num - 1) + 1);

        return dp[num] = ret;
    }

    public static void main(String[] args) throws IOException {


        n = Integer.parseInt(br.readLine());

        Arrays.fill(dp, Integer.MAX_VALUE);

        int result = solve(n);

        bw.write(String.valueOf(result));
        bw.flush();
    }


}