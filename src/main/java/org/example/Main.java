package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static Scanner sc = new Scanner(System.in);

    public static int n = 0;

    public static int m = 0;

    public static ArrayList<Integer> list = new ArrayList<>();

    public static int result = -1;

    public static boolean[] visit = new boolean[105];


    public static void init() {
        Arrays.fill(visit, false);
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int i1 = sc.nextInt();
            list.add(i1);
        }
    }

    //   방법2: 재귀함수 방식
    public static void solve(int cnt, int sum, int idx) {
        if (cnt == 3) {
            if (result < sum && sum <= m) {
                result = sum;
            }
            return;
        }

        for (int i = idx + 1; i < n; i++) {

            if (visit[i] == false) {
                visit[i] = true;
                solve(cnt + 1, sum + list.get(i), i);
                visit[i] = false;
            }

        }


    }

    public static void output() {
        System.out.println(result);
    }

    public static void main(String[] args) {

        init();
        input();


        for (int i = 0; i < n; i++) {
            visit[i] = true;
            solve(1, list.get(i), i);
            visit[i] = false;
        }


        output();

    }
}



