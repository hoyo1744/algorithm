package org.example;


// n과 m(1)

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int m;

    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        input();

        for (int i = 1; i <= n; i++) {

            list.add(i);
            solve(i, 1);
            list.remove(list.size() - 1);

        }
    }

    public static void input() throws IOException {
        String in = br.readLine();

        StringTokenizer st = new StringTokenizer(in);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }

    public static void solve(int num, int dist) {
        if (dist == m) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
            return;
        }

        for (int i = num + 1; i <= n; i++) {
            if (dist + 1 <= m) {
                list.add(i);
                solve(i, dist + 1);
                list.remove(list.size() - 1);
            }

        }


    }


}



