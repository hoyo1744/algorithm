package org.example;


import java.io.*;
import java.util.*;
import java.util.stream.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



    public static void main(String[] args) throws IOException{


        while (true) {
            String str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            Stack<Character> stack1 = new Stack<>();



            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack1.push('(');
                } else if (str.charAt(i) == ')') {
                    if (stack1.isEmpty()) {
                        stack1.push('#');
                        break;
                    } else if (stack1.peek() == '(') {
                        stack1.pop();
                    } else {
                        stack1.push('#');
                        break;
                    }

                } else if (str.charAt(i) == '[') {
                    stack1.push('[');
                } else if (str.charAt(i) == ']') {
                    if (stack1.isEmpty()) {
                        stack1.push('#');
                        break;
                    } else if (stack1.peek() == '[') {
                        stack1.pop();
                    } else {
                        stack1.push('#');
                        break;
                    }

                }
            }

            if (stack1.empty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }


        bw.flush();




    }



}

