
package org.example;

// 요세푸스 문제

import java.util.*;
import java.util.stream.*;
import java.io.*;


public class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static List<Integer> result = new ArrayList<>();

    public static int n;

    public static int k;

    public static Deque<Integer> dq = new ArrayDeque<>();

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }
    }

    public static void output() throws IOException {

        bw.write("<");
        for (int i = 0; i < result.size(); i++) {
            bw.write(String.valueOf(result.get(i)));
            if (i != result.size() - 1) {
                bw.write(", ");
            }
        }

        bw.write(">");
        bw.flush();
    }

    public static void solve() {
        while (dq.size() > 0) {

            for (int i = 1; i < k ; i++) {
                int last = dq.removeFirst();
                dq.addLast(last);
            }

            int find = dq.removeFirst();
            result.add(find);
        }
    }

    public static void main(String[] args) throws IOException {

        input();
        solve();
        output();

    }



}