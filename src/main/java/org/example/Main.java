package org.example;


import java.util.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;


    public static int[] arr = new int[10005];

    public static void main(String[] args) throws IOException {

        init();
        input();
        solve();
    }

    public static void init() throws IOException {
        Arrays.fill(arr, 0);
    }

    public static void input() throws IOException {

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);


        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            str = br.readLine();

            st = new StringTokenizer(str);

            int next = Integer.parseInt(st.nextToken());

            arr[next]++;
        }
    }

    public static void solve() throws IOException {
        for (int i = 1; i <= 10000; i++) {

            int cnt = arr[i];

            for (int j = 0; j < cnt; j++) {
                bw.write(String.valueOf(i));
                bw.write("\n");
            }
        }

        bw.flush();

    }

}



