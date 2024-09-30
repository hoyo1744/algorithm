package org.example;


import java.util.*;
import java.io.*;
import java.util.stream.*;

class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Integer> prime = new ArrayList<>();

    public static boolean[] noPrime = new boolean[1000005];

    public static boolean[] check = new boolean[1000005];

    public static int t;


    public static void eratostenes() {

        noPrime[0] = true;
        noPrime[1] = true;


        for (int i = 2; i <= 1000000; i++) {
            if (noPrime[i] == false) {
                prime.add(i);
                for (int j = i + i; j <= 1000000; j += i) {
                    noPrime[j] = true;
                }
            }
        }
    }

    public static void solve(int num) throws IOException{

        int count = 0;
        Arrays.fill(check, false);

        for (int i = 0; i < prime.size(); i++) {
            if (num <= prime.get(i)) {
                break;
            }

            if (check[prime.get(i)] == true) {
                continue;
            }

            check[prime.get(i)] = true;
            int mod = num - prime.get(i);
            if (noPrime[mod] == false) {
                check[mod] = true;
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.write("\n");
    }

    public static void main(String[] args) throws IOException{


        String str = br.readLine();


        t = Integer.parseInt(str);

        eratostenes();

        for (int i = 0; i < t; i++) {
            str = br.readLine();

            int num = Integer.parseInt(str);

            solve(num);

        }


        bw.flush();


    }



}

