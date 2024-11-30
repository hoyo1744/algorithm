package org.example;

import java.io.*;
import java.util.*;


class Main {

    public static int n;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[] queen = new int[20];

    public static int result;

    public static Deque<Integer> history = new ArrayDeque<>();

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }

    public static boolean isQueenPossible(int row, int nextQueen) {

        for (int col = 1; col <= row; col++) {

            if (queen[col] == nextQueen || Math.abs(queen[col] - nextQueen) == (row - col)) {
                return false;
            }
        }

        return true;
    }

    public static void solve(int row, int cnt) {
        if (cnt == n) {
            result += 1;
            return;
        }

        for (int col = 1; col <= n; col++) {
            if (isQueenPossible(row, col )) {
                queen[row] = col;
                history.addLast(col);
                solve(row + 1, cnt + 1);
                queen[row] = 0;
                history.removeLast();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solve(1, 0);
        output();
    }


}


