
package org.example;

//슈퍼마리오

import java.util.*;
import java.util.stream.*;
import java.io.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result = Integer.MAX_VALUE;

    public static int[] arr = new int[15];

    public static int[] sum = new int[15];


    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        for (int i = 0; i < 10; i++) {
            int v = Integer.parseInt(br.readLine());
            arr[i+1] = v;
        }
    }

    public static void solve() throws IOException {
        for (int i = 1; i <= 10; i++) {
            sum[i] = sum[i-1] + arr[i];
        }


        int temp = Math.abs(sum[1] - 100);
        result = sum[1];

        for (int i = 2; i <= 10; i++) {
            if (temp >= Math.abs(sum[i] - 100) ) {
                temp = Math.abs(sum[i] - 100);
                result = sum[i];
            }
        }
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }


}