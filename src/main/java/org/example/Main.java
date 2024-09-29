package org.example;

import java.util.*;
import java.util.stream.*;
import java.io.*;
class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static boolean[] noPrime = new boolean[300000];

    public static void eratostenes() {

        noPrime[0] = true;
        noPrime[1] = true;

        for (int i = 2; i <= 246912; i++) {
            if (noPrime[i] == false) {
                for (int j = i + i; j <= 246912; j += i) {
                    noPrime[j] = true;
                }
            }
        }
    }



    public static void main(String[] args) throws IOException{

        eratostenes();

        while (true) {
            String str = br.readLine();

            int value = Integer.parseInt(str);


            if (value == 0) {
                break;
            }

            int start = value;
            int end = 2 * value;
            int count = 0;

            for (int i = start + 1; i <= end; i++) {
                if (noPrime[i] == false) {
                    count++;
                }
            }

            bw.write(String.valueOf(count));
            bw.write("\n");




        }

        bw.flush();


    }




}

