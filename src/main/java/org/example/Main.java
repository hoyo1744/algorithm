package org.example;

import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result;
    public static void main(String[] args) throws IOException {


        int n = Integer.parseInt(br.readLine());


        for (int i = 1; i <= n; i++) {
            if (validation(i)) {
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }

    public static boolean validation(int number){

        ArrayList<Integer> digit = new ArrayList<>();

        int temp = number;
        while(temp > 0){
            digit.add(temp%10);
            temp /= 10;
        }

        if ( digit.size() == 1) {
            return true;
        }

        if (digit.size() == 2) {
            return true;
        }

        if (digit.size() == 3) {
            if ( digit.get(0) - digit.get(1) == digit.get(1) - digit.get(2) ||
                    digit.get(2) - digit.get(1) == digit.get(1) - digit.get(0)
            ){
                return true;
            }
        }

        return false;
    }


}