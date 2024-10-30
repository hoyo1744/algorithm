package org.example;


import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{

        int n = Integer.parseInt(br.readLine());

        BigInteger value = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            value = value.multiply(BigInteger.valueOf(i));
        }

        bw.write(value.toString());
        bw.flush();


    }


}


