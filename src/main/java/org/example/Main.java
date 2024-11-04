package org.example;

import java.util.*;
import java.util.stream.*;
import java.io.*;



class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



    public static void solve(int left, int right, boolean mid) throws IOException{

        if (right - left + 1 == 1 ) {
            if (mid == false) {
                if (left % 3 == 0 || left % 3 == 1) {
                    bw.write("-");
                } else {
                    bw.write(" ");
                }
            } else {
                bw.write(" ");
            }

            return;
        }

        int remain = (right - left + 1)/3;

        solve(left, left + remain -1, mid);
        solve(left + remain , left + remain + remain - 1, true);
        solve( left + remain + remain, right, mid);
    }

    public static void main(String[] args) throws IOException{

        String str = "";
        while ((str = br.readLine()) != null && !str.isEmpty()) {
            int n = Integer.parseInt(str);
            int last = (int)Math.pow(3, n);
            solve(1, last, false);
            bw.write("\n");
            bw.flush();
        }

    }



}


