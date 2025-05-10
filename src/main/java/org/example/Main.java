package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {


    public static int n;

    public static int k;

    public static int[] arr = new int[100_002];

    public static int[] sum = new int[100_002];

    public static int result = Integer.MIN_VALUE;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + arr[i];
        }
    }

    public static void solve() throws IOException {

        // 누적합
        for (int i = k; i <= n; i++) {
            result = Math.max(result, sum[i] - sum[i-k]);
        }

    }




}