package org.example;

import java.util.stream.*;
import java.util.*;
import java.io.*;

class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int t;

    public static int cnt;



    public static int solve(String str, int left, int right) {
        cnt = cnt + 1;

        if (left >= right) {
            return 1;
        } else if (str.charAt(left) != str.charAt(right)) {
            return 0;
        } else {
            return solve(str, left + 1, right - 1);
        }
    }


    public static void main(String[] args) throws IOException{

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            cnt = 0;
            int result = solve(str, 0, str.length() - 1);
            bw.write(String.valueOf(result) + " " + String.valueOf(cnt) + "\n");
        }

        bw.flush();






    }




}


