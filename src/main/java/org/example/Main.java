package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGcd(b, a%b);
        }
    }

    public static void main(String[] args) throws IOException {


        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());



        str = br.readLine();
        st = new StringTokenizer(str);
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int gcd = 0;
        if (b1 < b2) {
            gcd = getGcd(b1, b2);
        } else {
            gcd = getGcd(b2, b1);
        }

        int lcd = b1 * b2 / gcd;

        int mod1 = lcd / b1;
        int mod2 = lcd / b2;

        int result1 = mod1 * a1  + mod2 * a2;


        int mod = 0;
        if (result1 < lcd) {
            mod = getGcd(result1, lcd);
        } else {
            mod = getGcd(lcd, result1);
        }




        bw.write(String.valueOf(result1/mod));
        bw.write(" ");
        bw.write(String.valueOf(lcd/mod));
        bw.flush();







    }


}

