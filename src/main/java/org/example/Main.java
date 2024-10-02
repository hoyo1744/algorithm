package org.example;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int k;

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        k = Integer.parseInt(str);

        for (int i = 0; i < k; i++) {
            str = br.readLine();

            int num = Integer.parseInt(str);

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int result = 0;
        while(!stack.empty()){
            result += stack.pop();
        }





        bw.write(String.valueOf(result));
        bw.flush();

    }
}

