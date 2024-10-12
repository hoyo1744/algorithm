package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int m;

    public static Deque<Integer> dq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        String isStack = br.readLine();
        String datas = br.readLine();

        StringTokenizer st1 = new StringTokenizer(isStack);
        StringTokenizer st2 = new StringTokenizer(datas);

        for (int i = 0; i < n; i++) {
            int stack = Integer.parseInt(st1.nextToken());
            int data = Integer.parseInt(st2.nextToken());

            if (stack == 0) {
                dq.addLast(data);
            }
        }

        m = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st3 = new StringTokenizer(str);

        for (int i = 0; i < m; i++) {
            dq.addFirst(Integer.parseInt(st3.nextToken()));
            bw.write(String.valueOf(dq.removeLast()) + " ");
        }


        bw.flush();


    }

}

