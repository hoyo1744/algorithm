
package org.example;

// 나머지 합

import java.util.stream.*;
import java.io.*;
import java.util.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static long[] arr = new long[1_000_005];

    public static long[] sum = new long[1_000_005];

    public static long[] count = new long[10000];

    public static int n;

    public static int m;

    public static long result;


    public static void solve() {

        for (int i = 0; i <= n; i++) {
            count[(int)(sum[i]%m)]++;
        }

        for (int i = 0; i <= m; i++) {
            result += (count[i] * (count[i]-1))/2;
        }

    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }


    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1] + arr[i];
        }
    }



    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

}