package org.example;


// n과 m(1)


import java.io.*;
import java.util.*;

class Main {

    public static int n;

    public static int m;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Integer> list = new ArrayList<>();

    public static boolean[] visit = new boolean[100];


    public static void main(String[] args) throws IOException {
        input();

        for (int i = 1; i <= n; i++) {
            list.add(i);
            visit[i] = true;
            solve(i, 1);
            visit[i] = false;
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


        for (int i = 1; i <= n; i ++) {
            if (dist + 1 <= m && visit[i] == false) {
                list.add(i);
                visit[i] = true;
                solve(i, dist + 1);
                visit[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

}



