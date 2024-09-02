package org.example;


import java.io.*;

import java.util.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i));
        }
        bw.flush();

    }


}

