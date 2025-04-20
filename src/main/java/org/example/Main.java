package org.example;

import java.util.*;
import java.util.stream.*;
import java.io.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));




    public static void main(String[] args) throws IOException {

        while(true){
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                break;
            }

            solve(num);
        }

    }

    public static void solve(int num) throws IOException {
        String str = String.valueOf(num);

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            bw.write("yes\n");
        } else {
            bw.write("no\n");
        }

        bw.flush();
    }
}