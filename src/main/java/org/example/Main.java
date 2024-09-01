package org.example;


import java.util.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        input();
    }

    public static void input() throws IOException {

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {

            str = br.readLine();
            st = new StringTokenizer(str);

            int next = Integer.parseInt(st.nextToken());

            list.add(next);
        }

        list.sort(Comparator.naturalOrder());


        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(list.get(i)));
            bw.write("\n");
        }

        bw.flush();
    }

}



