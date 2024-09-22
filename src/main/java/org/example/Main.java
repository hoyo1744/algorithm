package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static HashSet<String> check = new HashSet<>();



    public static void main(String[] args) throws IOException{


        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {

            String msg = String.valueOf(str.charAt(i));

            check.add(msg);

            for (int j = i + 1; j < str.length(); j++) {
                msg = msg + String.valueOf(str.charAt(j));
                check.add(msg);
            }
        }



        bw.write(String.valueOf(check.size()));
        bw.flush();
    }





}

