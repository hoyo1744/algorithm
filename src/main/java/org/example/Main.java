package org.example;



import java.io.*;
import java.util.*;
import java.util.stream.*;
class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));




    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        int n = Integer.parseInt(str);


        for (int i = 0; i < n; i++) {
            str = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                Character ch = str.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        stack.push('#');
                        break;
                    }

                }
            }

            if (stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }

            bw.flush();


        }



    }

}

