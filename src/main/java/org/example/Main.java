package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;


public class Main {

    public static char[][] arr = new char[101][101];

    public static boolean[][] check = new boolean[101][101];

    public static int n;

    public static int m;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    static class Pair {
        public int x;
        public int y;

        public int d;

        public  Pair(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;

        }
    }


    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String line = "0" + br.readLine();
            arr[i] = line.toCharArray();
        }

    }

    public static void solve() {
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(1,1,1));
        check[1][1] = true;


        while (q.size() > 0) {
            Pair p = q.poll();

            if (p.x == n && p.y == m) {
                result = p.d;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m) {
                    if (check[nx][ny] == false && arr[nx][ny] == '1') {
                        check[nx][ny] = true;
                        q.add(new Pair(nx, ny, p.d + 1));
                    }

                }

            }



        }
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }


}