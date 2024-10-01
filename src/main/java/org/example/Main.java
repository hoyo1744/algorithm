package org.example;



import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();

            StringTokenizer st = new StringTokenizer(cmd);
            int num = Integer.parseInt(st.nextToken());


            if (num == 5) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(stack.peek()));
                    bw.write("\n");
                }
            } else if (num == 4) {
                if (stack.empty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (num == 3) {
                bw.write(String.valueOf(stack.size()));
                bw.write("\n");
            } else if (num == 2) {
                if (stack.empty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(stack.pop()));
                    bw.write("\n");
                }

            } else if (num == 1) {
                int input = Integer.parseInt(st.nextToken());
                stack.push(input);
            }
        }


        bw.flush();



    }


}

