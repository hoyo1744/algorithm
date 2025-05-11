
package org.example;
// 막대기


import java.util.*;
import java.util.stream.*;
import java.io.*;


public class Main {

    public static int n;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result;

    public static List<Integer> list = new ArrayList<>();

    public static int[] arr = new int[10];

    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }

    public static void solve() {
        while (true) {

            if (n == 1) {
                result++;
                break;
            }

            if (n == 0) {
                break;
            }

            int mod = n % 2;
            if (mod == 1) {
                result++;
            }

            n = n / 2;
        }
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }



}