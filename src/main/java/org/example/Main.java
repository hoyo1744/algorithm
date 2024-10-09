package org.example;



import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static Deque<Integer> dq = new ArrayDeque<>();


    public static void main(String[] args) throws IOException{


        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();

            StringTokenizer st = new StringTokenizer(cmd);
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                int value = Integer.parseInt(st.nextToken());
                dq.addFirst(value);
            } else if (num == 2) {
                int value = Integer.parseInt(st.nextToken());
                dq.addLast(value);
            } else if (num == 3) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(dq.removeFirst()));
                    bw.write("\n");
                }
            } else if (num == 4) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(dq.removeLast()));
                    bw.write("\n");
                }
            } else if (num == 5) {
                bw.write(String.valueOf(dq.size()));
                bw.write("\n");
            } else if (num == 6) {
                if (dq.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (num == 7) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(dq.peekFirst()));
                    bw.write("\n");
                }
            } else if (num == 8) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(dq.peekLast()));
                    bw.write("\n");
                }
            }



        }


//        System.out.println("-----------");
        bw.flush();

    }



}

