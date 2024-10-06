package org.example;

import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException{

        int n = Integer.parseInt(br.readLine());


        for (int i = 1; i <= n; i++) {
            q.add(i);
        }


        int idx = 1;
        while (true) {
            if (q.size() == 1) {
                break;
            }


            if (idx % 2 == 1) {
                q.remove();
            } else {
                int num = q.remove();
                q.add(num);
            }
            idx++;

        }


        bw.write(String.valueOf(q.peek()));
        bw.flush();
    }





}

