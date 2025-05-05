package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;


    public static int s;

    public static int result = Integer.MAX_VALUE;

    public static int[] arr = new int[100_000];

    public static int[] sum = new int[100_000];


    public static void main(String[] args) throws IOException {

        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + arr[i];
        }
    }

    public static void solve() {

        int start = 1;
        int end =  1;

        while (start <= end && end <= n) {
            int current = sum[end] - sum[start - 1];
            if (current >= s) {
                result = Math.min(result, end - start + 1);
                start++;
                if (start > end && start <= n) {
                    end = start;
                }
            } else if (current < s) {
                end++;
            }
        }
    }

    public static void output() throws IOException {

        if (result == Integer.MAX_VALUE) {
            bw.write("0");
        } else {
            bw.write(String.valueOf(result));
        }

        bw.flush();

    }







}