package org.example;


// 영화감독 숌


import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    public static int n;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result;
    public static void main(String[] args) throws IOException {

        init();

        input();
        solve();
        output();
    }

    public static void init() {
        n = 0;
        result = 0;
    }

    public static void input() throws IOException {
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        n = Integer.parseInt(st.nextToken());
    }

    public static void solve() {

        int num = 1;
        int cnt = 0;

        while (true) {
            if (true == check666(num)) {
                cnt++;
            }


            if (cnt == n) {
                result = num;
                break;
            }

            num++;
        }
    }

    public static void output() throws IOException {
        wr.write(String.valueOf(result));
        wr.flush();
    }

    public static boolean check666(int num) {

        int continueNum = 0;

        int temp = num;

        while (true) {

            if (temp == 0) {
                break;
            }

            int div = temp % 10;

            if (div == 6) {
                continueNum++;
            } else {
                continueNum = 0;
            }

            if (continueNum >= 3) {
                return true;
            }

            temp /= 10;
        }


        return false;

    }
}



