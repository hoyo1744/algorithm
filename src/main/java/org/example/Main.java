package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int n =Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();



    }


}

