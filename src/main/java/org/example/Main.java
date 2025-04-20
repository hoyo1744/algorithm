package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;



public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result;



    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        boolean isMinus = false;
        boolean isFirstMinus = false;
        String number = "";

        int left = 0;
        int right = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                if (isFirstMinus == false) {
                    isFirstMinus = true;
                    left += Integer.parseInt(number);
                    number = "";
                } else {
                    right += Integer.parseInt(number);
                    number = "";
                }
            } else if (str.charAt(i) == '+') {

                if (isFirstMinus == false) {
                    left += Integer.parseInt(number);
                    number = "";
                } else{
                    right += Integer.parseInt(number);
                    number = "";
                }
            } else {
                // 일반 숫자.
                number = number + str.charAt(i);
            }
        }

        if (number.length() > 0) {
            right += Integer.parseInt(number);
        }

        if (isFirstMinus) {
            result = left - right;
        } else {
            result = left + right;
        }

        bw.write(String.valueOf(result));
        bw.write("\n");
        bw.flush();

    }


}