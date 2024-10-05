package org.example;



import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;


    public static Deque<Integer> dq = new ArrayDeque<>();


    public static void main(String[] args) throws IOException{


        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String cmd = br.readLine();

            StringTokenizer st = new StringTokenizer(cmd);

            String msg = st.nextToken();
            if (msg.equals("push")) {
                int value = Integer.parseInt(st.nextToken());
                dq.addLast(value);
            } else if (msg.equals("front")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(dq.getFirst()));
                    bw.write("\n");
                }
            } else if (msg.equals("back")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(dq.getLast()));
                    bw.write("\n");
                }
            } else if (msg.equals("size")) {
                bw.write(String.valueOf(dq.size()));
                bw.write("\n");
            } else if (msg.equals("empty")) {
                if (dq.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (msg.equals("pop")) {
                if (dq.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(dq.pop()));
                    bw.write("\n");
                }

            }


        }


        bw.flush();



    }




}

