package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static Map<Character, Integer> map = new HashMap<>();



    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == null) {
                map.put(str.charAt(i), 1);
            } else {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count+1);
            }
        }


        for (int i = 'a'; i <= 'z'; i++) {
            if (map.get((char)i) == null) {
                bw.write("0" + " ");
            } else {
                bw.write(String.valueOf(map.get((char)i)) + " ");
            }

        }





        bw.flush();
    }


}