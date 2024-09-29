package org.example;


import java.io.*;
import java.util.*;
import java.util.stream.*;



class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static boolean isPrime(long value) {

        if (value <= 1) {
            return false;
        }

        for (long i = 2; i*i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static long solve(long input) {

        long start = input;

        while (true) {
            if (isPrime(start)) {
                return start;
            }
            start += 1;
        }
    }



    public static void main(String[] args) throws IOException{


        String str = br.readLine();

        int n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            long input = Long.parseLong(str);
            long value = solve(input);
            bw.write(String.valueOf(value));
            bw.write("\n");
        }

        bw.flush();

    }




}

