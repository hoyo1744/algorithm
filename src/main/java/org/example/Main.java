package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int result;

    public static void solve(int num, int left, int mid, int right) throws  IOException{
        if (num == 1) {
            bw.write(String.valueOf(left) + " " + String.valueOf(right) + "\n");
            return;
        }


        solve(num - 1, left, right ,mid);
        bw.write(String.valueOf(left) + " " + String.valueOf(right) + "\n");
        solve(num - 1, mid, left, right);

    }

    public static void main(String[] args) throws IOException{

        n = Integer.parseInt(br.readLine());

        result = 1;

        for (int i = 1; i < n; i++) {
            result = result * 2 + 1;
        }

        bw.write(String.valueOf(result) + "\n");

        solve(n, 1, 2, 3);
        bw.flush();
    }



}


