package org.example;



import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static long getGcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return getGcd(b, a%b);
        }
    }

    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());


        long gcd = 0;
        if (a < b) {
            gcd = getGcd(a, b);
        } else {
            gcd = getGcd(b, a);
        }

        long lcd = a * b / gcd;

        bw.write(String.valueOf(lcd));
        bw.flush();

    }

}

