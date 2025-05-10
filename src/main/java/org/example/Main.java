
package org.example;
// 두 수의 합

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static int n;

    public static int x;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result;

    public static List<Integer> arr = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        x = Integer.parseInt(br.readLine());
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }

    public static void solve() {

        arr.sort(Comparator.naturalOrder());

        int left = 0;
        int right = n - 1;

        while (left < right && right >= 0 && left <= n - 1) {
            int current = arr.get(left) + arr.get(right);

            if (current == x) {
                left++;
                right--;
                result++;
            } else if (current < x) {
                left++;
            } else if (current > x) {
                right--;
            }
        }


    }


}