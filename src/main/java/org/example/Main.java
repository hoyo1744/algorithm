
package org.example;

// 1,2,3 더하기

import java.util.stream.*;
import java.util.*;
import java.io.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int t;

    public static int n;

    public static int result;

    public static void solve(int sum) {
        if (sum == n) {
            result++;
            return;
        }

        if (sum + 1 <= n) {
            solve(sum + 1);
        }
        if (sum + 2 <= n) {
            solve(sum + 2);
        }
        if (sum + 3 <= n) {
            solve(sum + 3);
        }
    }

    public static void init() {
        result = 0;
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result)+"\n");
        bw.flush();

    }


    public static void main(String[] args) throws IOException {

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            init();
            n = Integer.parseInt(br.readLine());
            solve(0);
            output();

        }
    }

}