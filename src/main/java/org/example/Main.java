package org.example;

import java.util.*;
import java.util.stream.*;
import java.io.*;



class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int m;

    public static boolean[] noPrime = new boolean[1000005];

    public static void eratostenes(int end) {


        noPrime[0] = true;
        noPrime[1] = true;


        for (int i = 2; i <= end; i++) {

            if (noPrime[i] == false) {
                for (int j = i + i; j <= end; j += i) {
                    noPrime[j] = true;

                }
            }
        }

    }

    public static void input() throws IOException{
        String str = br.readLine();


        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


    }

    public static void solve() throws IOException {

        eratostenes(m);

        for (int i = n; i <= m; i++) {
            if (noPrime[i] == false) {
                bw.write(String.valueOf(i));
                bw.write("\n");
            }
        }

        bw.flush();
    }

    public static void main(String[] args) throws IOException{

        input();
        solve();
    }





}

