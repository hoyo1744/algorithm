package org.example;


import java.util.*;
import java.io.*;
import java.util.stream.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int m;

    public static Deque<Integer> dq = new ArrayDeque<>();

    public static List<Integer> list = new ArrayList<>();





    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }


        while (true) {
            if (dq.size() == 1) {
                list.add(dq.remove());
                break;
            }

            for (int i = 1; i < m; i++) {
                int value = dq.remove();
                dq.addLast(value);
            }


            int value = dq.remove();
            list.add(value);
        }


        bw.write("<");
        for (int i = 0; i < list.size(); i++) {
            bw.write(String.valueOf(list.get(i)));

            if (list.size() - 1 != i) {

                bw.write(", ");
            }
        }

        bw.write(">");
        bw.flush();

    }

}

