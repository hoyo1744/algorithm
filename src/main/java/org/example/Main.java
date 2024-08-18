package org.example;


// 설탕 배달
// 완전탐색으로 풀 경우, 최대 2^1666의 시간복잡도를 갖는다.
// 그래서 완전탐색은 안되고, 그리디로 풀어야함.
// 두번째 : 다이나믹 프로그래밍


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {


    public static final int INF = 99999;


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int result = Integer.MAX_VALUE;

    public static boolean[] visit = new boolean[10005];

    //   dp[n] = n 키로 그램을 만들기 위해 필요한 최소한의 설탕 봉투 수.
    public static int[] dp = new int[5001];


    public static void main(String[] args) throws IOException {
        init();
        input();
        solve();
        output();
    }

    public static void init() {
        Arrays.fill(dp, INF);
    }
    public static void output() throws IOException {

        if (visit[n] == true) {
            wr.write(String.valueOf(dp[n]));
        } else {
            wr.write("-1");
        }
        wr.flush();

    }

    public static void input() throws IOException {
        String in = br.readLine();

        StringTokenizer st = new StringTokenizer(in);

        n = Integer.parseInt(st.nextToken());


    }

    public static void solve() {

        for (int i = 3; i <= 5001; i += 3) {
            visit[i] = true;

            for (int j = 5; j <= 5001; j +=5) {
                visit[j] = true;
                visit[j + i] = true;

            }
        }

        dp[3] = 1;
        dp[5] = 1;

        for (int i = 6; i <= n; i++) {
            if (i - 3 >= 0 || i - 5 >= 0) {
                dp[i] = Integer.min(dp[i-3], dp[i-5]) + 1;
            }
        }

    }

}



