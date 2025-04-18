package org.example;


import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static ArrayList<Atm> list = new ArrayList<>();

    public static int result;

    static class Atm implements Comparable<Atm>{
        public int num;

        public int p;

        public Atm(int num, int p) {
            this.num = num;
            this.p = p;
        }

        // 오름차순
        @Override
        public int compareTo(Atm atm){
           return this.p - atm.p;
        }
    }

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int v = Integer.parseInt(st.nextToken());

            list.add(new Atm(i, v));
        }
    }

    public static void solve() {
        list.sort(Comparator.naturalOrder());

        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            result += sum + list.get(i).p;
            sum += list.get(i).p;
        }
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }


    public static void main(String[] args) throws IOException {

        input();
        solve();
        output();
    }


}