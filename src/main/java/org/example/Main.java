package org.example;

import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {

    public static int n;

    public static int maxResult = Integer.MIN_VALUE;

    public static int minResult = Integer.MAX_VALUE;

    public static final int ADD = 1;

    public static final int MINUS = 2;

    public static final int MULTI = 3;

    public static final int DEVIDE = 4;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[] arr = new int[15];

    public static int[] oper = new int[5];

    public static void input() throws IOException {

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i + 1] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            oper[i + 1] = Integer.parseInt(st.nextToken());
        }
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(maxResult));
        bw.write("\n");
        bw.write(String.valueOf(minResult));
        bw.flush();
    }

    public static void solve(int idx, int value) {

        if (idx == n + 1) {

            if (value < minResult) {
                minResult = value;
            }

            if (value > maxResult) {
                maxResult = value;
            }

            return;
        }

        if (oper[ADD] > 0) {
            oper[ADD] -= 1;
            solve(idx + 1, value + arr[idx]);
            oper[ADD] += 1;
        }
        if (oper[MINUS] > 0) {
            oper[MINUS] -= 1;
            solve(idx + 1, value - arr[idx]);
            oper[MINUS] += 1;
        }
        if (oper[MULTI] > 0) {
            oper[MULTI] -= 1;
            solve(idx + 1, value * arr[idx]);
            oper[MULTI] += 1;
        }
        if (oper[DEVIDE] > 0) {
            oper[DEVIDE] -= 1;
            solve(idx + 1, value / arr[idx]);
            oper[DEVIDE] += 1;

        }

    }


    public static void main(String[] args) throws IOException {

        input();
        solve(2, arr[1]);
        output();


    }


}




