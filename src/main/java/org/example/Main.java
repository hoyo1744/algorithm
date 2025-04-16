package org.example;

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static Deque<Integer> dq = new ArrayDeque<>();

    public static int n;

    public static void main(String[] args) throws IOException {
        solve();
    }

    public static void solve() throws IOException {
        n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                int value = Integer.parseInt(st.nextToken());
                dq.addLast(value);
            } else if (cmd.equals("front")) {
                if (dq.size() > 0) {
                    bw.write(String.valueOf(dq.peekFirst()));
                    bw.write("\n");
                } else {
                    bw.write("-1");
                    bw.write("\n");
                }
            } else if (cmd.equals("back")) {
                if (dq.size() > 0) {
                    bw.write(String.valueOf(dq.peekLast()));
                    bw.write("\n");
                } else {
                    bw.write("-1");
                    bw.write("\n");
                }
            } else if (cmd.equals("size")) {
                bw.write(String.valueOf(dq.size()));
                bw.write("\n");
            } else if (cmd.equals("pop")) {
                if(dq.size() > 0){
                    bw.write(String.valueOf(dq.removeFirst()));
                    bw.write("\n");
                } else{
                    bw.write("-1");
                    bw.write("\n");
                }

            } else if (cmd.equals("empty")) {
                if (dq.size() > 0) {
                    bw.write("0");
                    bw.write("\n");
                } else {
                    bw.write("1");
                    bw.write("\n");
                }
            }
        }

        bw.flush();

    }

}