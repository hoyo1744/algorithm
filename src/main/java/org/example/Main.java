package org.example;


// 설탕 배달
// 완전탐색으로 풀 경우, 최대 2^1666의 시간복잡도를 갖는다.
// 그래서 완전탐색은 안되고, 그리디로 풀어야함.


import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int result = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static void output() throws IOException {
        if (result == Integer.MAX_VALUE) {
            wr.write("-1");
        } else {
            wr.write(String.valueOf(result));
        }
        wr.flush();
    }

    public static void input() throws IOException {
        String in = br.readLine();

        StringTokenizer st = new StringTokenizer(in);

        n = Integer.parseInt(st.nextToken());

    }

    public static void solve() {
        int num = n / 5;





        for (int i = num; i >= 0; i--) {
            int div = n - i*5;
            if (div % 3 == 0) {
                result = i + div/3;
                break;
            }
        }

    }
}



