package org.example;

import java.util.*;
import java.util.stream.*;
import java.io.*;


/***
 * 스타트와 링크
 */
class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result = Integer.MAX_VALUE;

    public static int[][] arr = new int[25][25];

    public static int n;

    public static boolean[] team = new boolean[25];


    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
    public static void solve(int idx, int cnt) {
        if (cnt == n / 2) {
            result = Integer.min(result, calculate());
            return;
        }

        for (int i = idx; i <= n; i++) {
            team[i] = true;
            solve(i + 1, cnt + 1);
            team[i] = false;
        }
    }

    public static int calculate() {

        List<Integer> startTeam = new ArrayList<>();
        List<Integer> linkTeam = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (team[i]) {
                startTeam.add(i);
            } else {
                linkTeam.add(i);
            }
        }

        int startTeamSum = 0;
        int linkTeamSum = 0;
        for (int i = 0; i < startTeam.size(); i++) {
            for (int j = 0; j < startTeam.size(); j++) {
                if (i == j) {
                    continue;
                }
                startTeamSum += arr[startTeam.get(i)][startTeam.get(j)];
            }
        }

        for (int i = 0; i < linkTeam.size(); i++) {
            for (int j = 0; j < linkTeam.size(); j++) {
                if (i == j) {
                    continue;
                }
                linkTeamSum += arr[linkTeam.get(i)][linkTeam.get(j)];
            }
        }



        return Math.abs(startTeamSum - linkTeamSum);

    }


    public static void main(String[] args) throws IOException {
        input();

        solve(1, 0);
        output();
    }

}




