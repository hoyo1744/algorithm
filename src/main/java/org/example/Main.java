package org.example;


import java.util.*;
import java.io.*;

class Main {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int sum = 0;

    public static int avg = 0;

    public static void main(String[] args) throws IOException{

        input();


    }

    public static void input() throws IOException {


        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            StringTokenizer  st = new StringTokenizer(str);

            int next = Integer.parseInt(st.nextToken());

            list.add(next);
            sum += next;
        }

        list.sort(Comparator.naturalOrder());

        avg = sum / 5;


        bw.write(String.valueOf(avg));
        bw.write("\n");
        bw.write(String.valueOf(list.get(2)));

        bw.flush();

    }







}



