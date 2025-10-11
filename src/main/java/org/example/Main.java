
package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static int n;

    public static int m;

    public static List<Integer> arr = new ArrayList<>();

    public static long result;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);
    }

    public static long calculate(long h) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) - h> 0) {
                sum+= arr.get(i) - h;
            }
        }

        return sum;
    }

    public static void solve() throws IOException {


        long left = 0;
        long right = arr.get(n - 1);

        if (n == 1) {
            result = arr.get(0) - m;
            return;
        }


        while (left <= right) {
            long mid = (right + left)/ 2;

            if (left > right) {
                return;
            }

            long calculate = calculate(mid);
            if (m <= calculate) {
                result = Math.max(result, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }



}