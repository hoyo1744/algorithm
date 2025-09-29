
package org.example;


import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Main {

    public static int n;

    public static int m;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result;

    public static List<Integer> list = new ArrayList<>();



    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static void input() throws IOException {

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str);

        m =  Integer.parseInt(str);

        str = br.readLine();
        st = new StringTokenizer(str);
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());
            list.add(v);
        }
    }

    public static void solve() {

        Collections.sort(list, Comparator.naturalOrder());

        int start = 0;
        int end = n - 1;

        while (start < end && end < n) {
            int cmp = list.get(start) + list.get(end);
            if (cmp == m) {
                start++;
                end--;
                result++;
            } else if (cmp > m) {
                end--;
                if (start >= end && end >= 0) {
                    end = start;
                }
            } else {
                start++;
                if (start >= end && start < n) {
                    end = start;
                }

            }

        }

    }

    public static void output() throws IOException {
        bw.write(String.valueOf(result));
        bw.flush();
    }






}