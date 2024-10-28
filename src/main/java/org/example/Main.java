package org.example;


import java.util.*;
import java.io.*;
import java.util.stream.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int k;

    public static boolean[] check = new boolean[15];

    public static int result;

    public static void input() throws IOException{
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        Arrays.fill(check, false);
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }

    public static void solve(int idx, int cnt) {
        if (cnt == k) {
            result++;
            return;
        }

        for (int i = idx + 1; i <= n; i++) {
            if (check[i] == false) {
                check[i] = true;
                solve(i, cnt+ 1);
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        input();
        for (int i = 1; i <= n; i++) {
            check[i] = true;
            solve(i, 1);
            check[i] = false;
        }

        if (k == 0) {
            result = 1;
        }


        output();
    }



}

