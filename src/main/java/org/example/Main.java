package org.example;


import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[] arr = new int[100_001];

    public static int[] sum = new int[100_001];


    public static int n;

    public static int m;


    public static void main(String[] args) throws IOException {
        
        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        String number = br.readLine();
        st = new StringTokenizer(number);
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

    }

    public static void solve() throws IOException {
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + arr[i];
        }
    }

    public static void output() throws IOException {
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(sum[end]-sum[start-1]) + "\n");
        }

        bw.flush();
    }


}