
package org.example;
// 2차원 배열의합

import java.util.*;

import java.util.stream.*;
import java.io.*;


public class Main {

    static class Pair {
        public int sx;
        public int sy;

        public int ex;

        public int ey;

        public Pair(int sx, int sy, int ex, int ey) {
            this.sx = sx;
            this.sy = sy;
            this.ex = ex;
            this.ey = ey;
        }
    }

    public static int n;

    public static int m;

    public static int k;

    public static int[][] arr = new int[305][305];

    public static int[][] sum = new int[305][305];

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static List<Pair> list = new ArrayList<>();

    public static List<Integer> result = new ArrayList<>();

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);

            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] +arr[i][j];
            }
        }

        k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Pair(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()))
            );
        }
    }

    public static void output() throws IOException {

        for (int i = 0; i < result.size(); i++) {
            bw.write(String.valueOf(result.get(i)));
            bw.write("\n");
        }
        bw.flush();
    }

    public static void solve() {
        for (int i = 0; i < k; i++) {
            Pair p = list.get(i);

            int x1 = p.ex;
            int y1 = p.sy - 1;

            int x2 = p.sx - 1;
            int y2 = p.ey;

            result.add(sum[p.ex][p.ey] - sum[x1][y1] - sum[x2][y2] + sum[p.sx-1][p.sy-1]);
        }

    }


    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }





}