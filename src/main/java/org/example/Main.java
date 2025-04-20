package org.example;


import java.util.*;
import java.io.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        solve();
    }

    public static void solve() throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);

            } else if (cmd.equals("pop")) {
                if (stack.size() > 0) {
                    int pop = stack.pop();
                    bw.write(String.valueOf(pop)+"\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (cmd.equals("size")) {
                bw.write(String.valueOf(stack.size()) + "\n");
            } else if (cmd.equals("empty")) {
                if (stack.size() > 0) {
                    bw.write("0\n");
                } else {
                    bw.write("1\n");
                }
            } else if (cmd.equals("top")) {
                if (stack.size() > 0) {
                    bw.write(String.valueOf(stack.peek()) + "\n");
                } else {
                    bw.write("-1\n");
                }
            }

        }

        bw.flush();

    }




}