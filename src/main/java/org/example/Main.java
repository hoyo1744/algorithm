package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Integer> arr = new ArrayList<>();

    public static ArrayList<Integer> diff = new ArrayList<>();


    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a%b);
    }

    public static void main(String[] args) throws IOException{

        int result = 0;

        String str = br.readLine();

        int n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            String value = br.readLine();
            int num = Integer.parseInt(value);

            arr.add(num);
        }

        int n1 = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            diff.add(arr.get(i) - arr.get(i-1));
        }


        int gcdValue = gcd(diff.get(0), diff.get(1));
        for (int i = 2; i < diff.size(); i++) {
            gcdValue = gcd(gcdValue, diff.get(i));
        }

        int startValue = arr.get(0);
        int lastValue = arr.get(arr.size() - 1);


        result = (lastValue - startValue)/gcdValue  + 1;

        bw.write(String.valueOf(result - arr.size()));
        bw.flush();






    }


}

