
package org.example;
// 배열 합치기

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static int a;

    public static int b;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= a; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= b; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }


        list.sort(Comparator.naturalOrder());

        for (int i = 0; i < list.size(); i++) {
            bw.write(String.valueOf(list.get(i)) + " ");
        }
        bw.flush();


    }





}