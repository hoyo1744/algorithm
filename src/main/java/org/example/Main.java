package org.example;


import java.io.*;
import java.util.*;
import java.util.stream.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int[] dx = {0, 1, 1, 0, -1, -1, -1, 0, 1};
    public static int[] dy = {0, 0, 1, 1, 1, 0, -1, -1, -1};

    public static char[][] data = new char[2200][2200];

    public static void solve(int x, int y, int pow, boolean mid) {

        if (pow == 0) {
            if (mid) {
                data[x][y] = ' ';
            } else {
                data[x][y] = '*';
            }

            return;
        }


//      9등분
        for (int i = 0; i < 9; i++) {
            int next = (int)Math.pow(3, pow - 1);
            int nx = x + dx[i] * next;
            int ny = y + dy[i] * next;

            if (i == 0) {
                solve(nx, ny, pow - 1, true);
            } else {
                solve(nx, ny, pow - 1, mid);
            }
        }

    }

    public static void output() throws IOException{

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                bw.write(data[i][j]);
            }
            bw.write("\n");
        }

        bw.flush();

    }


    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        int mx = n / 2 + 1;
        int my = n / 2 + 1;

        int mod = (int)Math.log(n);


        for (int i = 0; i < 9; i++) {

            int next = (int)Math.pow(3, mod - 1);

            int nx = mx + dx[i] * next;

            int ny = my + dy[i] * next;


            if (i == 0) {
                solve(nx, ny, mod - 1, true);
            } else {
                solve(nx, ny, mod - 1, false);
            }

        }

        output();
    }
}


