package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int result;

    public static ArrayList<Pair> list = new ArrayList<>();

    static class Pair {
        public int t;
        public int p;

        public Pair(int t, int p){
            this.t = t;
            this.p = p;
        }
    }




    public static void main(String[] args) throws IOException {

        input();
        solve(1,0, 0 );
        output();

    }

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());

        list.add(new Pair(0,0));

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            list.add(new Pair(t, p));
        }
    }

    public static void solve(int day, int selectDay, int price) {
        if (day == n + 1) {
            result = Math.max(price, result);
            return;
        }

        if (selectDay + list.get(selectDay).t - 1 < day  && day + list.get(day).t -1 <= n) {
            // 현재를 선택할수 있는 경우
            solve(day + 1, day, price + list.get(day).p);
            solve(day + 1, selectDay, price);
        } else {
            // 현재를 선택할 수 없는 경우
            solve(day +1, selectDay, price);
        }
    }


    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }


}