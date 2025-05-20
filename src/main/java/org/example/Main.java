
package org.example;
// 두 용액

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static int resultLeft;

    public static int resultRight;

    public static int result = Integer.MAX_VALUE;

    public static int n;

    public static ArrayList<Integer> arr = new ArrayList<>();

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void input() throws IOException {
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        arr.sort(Comparator.naturalOrder());
    }

    public static void output() throws IOException {
        bw.write(String.valueOf(resultLeft) + " " + String.valueOf(resultRight));
        bw.flush();
    }

    public static void solve() {

        int left = 0;
        int right = n - 1;

        while (left < right && right >= 0) {

            int value = arr.get(left) + arr.get(right);
            if (value == 0) {
                resultLeft = arr.get(left);
                resultRight = arr.get(right);
                break;
            } else if (value > 0) {
                if (Math.abs(result) > Math.abs(value)) {
                    result = value;
                    resultLeft = arr.get(left);
                    resultRight = arr.get(right);
                }
                right--;
            } else if (value < 0) {
                if (Math.abs(result) > Math.abs(value)) {
                    result = value;
                    resultLeft = arr.get(left);
                    resultRight = arr.get(right);
                }
                left++;
            }
        }




    }


    public static void main(String[] args) throws IOException {

        input();
        solve();
        output();





    }



}