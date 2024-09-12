package org.example;


import java.util.*;
import java.io.*;

class Main {


    public static class Point implements Comparable<Point>{
        int x;
        int y;

        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p){
            if (this.y == p.y) {
                return this.x - p.x;
            }

            return this.y - p.y;
        }


        @Override
        public String toString() {
            return x + " " + y;
        }
    }

    public static int n;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Point> list = new ArrayList<>();

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
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Point p =new Point(x, y);

            list.add(p);
        }
    }

    public static void solve() throws  IOException {

        list.sort(Comparator.naturalOrder());
    }

    public static void output() throws IOException {
        for (int i = 0; i < n; i++) {
            bw.write(list.get(i).toString());
            bw.write("\n");
        }

        bw.flush();
    }




}

