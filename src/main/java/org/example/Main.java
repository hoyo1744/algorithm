package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) throws IOException{

        String str = br.readLine();
        int n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            str = br.readLine();

            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = 0;

            if (a < b) {
                result = gcd(a, b);
            } else {
                result = gcd(b, a);
            }

            result = a*b/result;

            bw.write(String.valueOf(result));
            bw.write("\n");





        }

        bw.flush();





    }





}

