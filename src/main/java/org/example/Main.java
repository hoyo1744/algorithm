package org.example;


import java.io.*;
import java.util.*;

class Main {

    public static int n;

    public static int k;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Integer> list = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        input();

    }

    public static void input() throws IOException {

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str);


        while (st.hasMoreTokens()) {

            int next = Integer.parseInt(st.nextToken());

            list.add(next);
        }

        list.sort(Comparator.reverseOrder());


        bw.write(String.valueOf(list.get(k - 1)));
        bw.flush();


    }


}



