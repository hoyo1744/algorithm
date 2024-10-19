package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            bw.write(String.valueOf(2));
        } else if (n == 2) {
            bw.write(String.valueOf(4));

        } else if (n == 3) {
            bw.write(String.valueOf(8));
        } else if (n == 4) {
            bw.write(String.valueOf(16));
        } else {
            bw.write(String.valueOf(32));
        }

        bw.flush();


    }


}

