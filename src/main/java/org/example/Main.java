package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int m;

    public static int[][] arr = new int[10][10];

    public static ArrayList<Point> walls = new ArrayList<>();

    public static ArrayList<Point> virus = new ArrayList<>();

    public static int result;

    public static int[] dx = {1,0, -1, 0};

    public static int[] dy = {0,1,0,-1};

    public static boolean[][] check = new boolean[10][10];

    static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
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
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                int v= Integer.parseInt(st.nextToken());
                arr[i][j] = v;

                if (v == 0) {
                    walls.add(new Point(i, j));
                } else if (v == 2) {
                    virus.add(new Point(i, j));
                }
            }
        }
    }


    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }


    public static void solve() {

        // 3개의 벽 선택
        for (int i = 0; i < walls.size(); i++) {
            for (int j = i + 1; j < walls.size(); j++) {
                for (int k = j + 1; k < walls.size(); k++) {

                    bfs(i, j, k);
                }
            }
        }
    }

    public static void bfs(int a, int b, int c) {


        // 벽세우기
        arr[walls.get(a).x][walls.get(a).y] = 1;
        arr[walls.get(b).x][walls.get(b).y] = 1;
        arr[walls.get(c).x][walls.get(c).y] = 1;

        for (int i = 1; i <= 8; i++) {
            Arrays.fill(check[i], false);
        }
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < virus.size(); i++) {
            check[virus.get(i).x][virus.get(i).y] = true;
            q.add(virus.get(i));
        }

        while (q.size() > 0) {
            Point v = q.poll();


            for (int i = 0; i < 4; i++) {
                int nx = v.x + dx[i];
                int ny = v.y + dy[i];

                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m) {
                    if (check[nx][ny] == false && arr[nx][ny] == 0) {
                        check[nx][ny]=true;
                        q.add(new Point(nx,ny));
                    }
                }
            }
        }


        int safe = 0;
        // 안전지대 체크
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr[i][j] == 0 && check[i][j] == false) {
                    safe++;
                }
            }
        }

        arr[walls.get(a).x][walls.get(a).y] = 0;
        arr[walls.get(b).x][walls.get(b).y] = 0;
        arr[walls.get(c).x][walls.get(c).y] = 0;

        result = Math.max(safe, result);
    }

}