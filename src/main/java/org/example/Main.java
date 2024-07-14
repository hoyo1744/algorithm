package org.example;


import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static Scanner sc = new Scanner(System.in);

    public static int n = 0;

    public static int m = 0;

    public static ArrayList<Integer> list = new ArrayList<>();

    public static int result = -1;


    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int i1 = sc.nextInt();
            list.add(i1);
        }
    }

    public static void solve() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (list.get(i) + list.get(j) + list.get(k) <= m) {
                        if (result < list.get(i) + list.get(j) + list.get(k)) {
                            result = list.get(i) + list.get(j) + list.get(k);
                        }
                    }
                }
            }
        }
    }

    public static void output() {
        System.out.println(result);
    }

    public static void main(String[] args) {

        input();
        solve();
        output();

    }
}



