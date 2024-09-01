package org.example;


import java.io.*;
import java.util.*;

class Main {


    public static int n;

    public static ArrayList<Integer> list = new ArrayList<>();

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException{

        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);
            int next = Integer.parseInt(st.nextToken());
            list.add(next);
        }
    }

    public static void solve() throws IOException {
        list.sort(Comparator.naturalOrder());
    }

    public static void output() throws IOException {
        for (Integer integer : list) {
            bw.write(String.valueOf(integer));
            bw.write("\n");
        }

        bw.flush();
    }



}



