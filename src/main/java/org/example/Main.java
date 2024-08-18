package org.example;


// n과 m(3)

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    public static int n;
    public static int m;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static Scanner sc = new Scanner(System.in);

    public static List<Integer> list = new ArrayList<>();


    public static void main(String[] args) throws IOException{

        input();

        for (int i = 1; i <= n; i++) {
            list.add(i);
            solve(i, 1);
            list.remove(list.size() - 1);
        }

        bw.flush();



    }

    public static void input() throws IOException {

        String in = br.readLine();

        StringTokenizer st = new StringTokenizer(in);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }

    public static void solve(int num, int dist) throws IOException{

        if (dist == m) {
            for (Integer i : list) {
                bw.write(String.valueOf(i));
                bw.write(" ");
            }
            bw.write("\n");


            return;
        }

        for (int i = 1; i <= n; i++) {
            if (dist + 1 <= m) {
                list.add(i);
                solve(i, dist + 1);
                list.remove(list.size() - 1);
            }
        }
    }


}



