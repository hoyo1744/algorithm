package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int t;

    public static int result;

    public static void main(String[] args) throws IOException {

        t = Integer.parseInt(br.readLine());

        for (int j = 0; j < t; j++) {
            String str = br.readLine();
            result = 0;

            int continueCount = 0;
            for(int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'O') {
                    continueCount++;
                    result += continueCount;
                } else {
                    continueCount = 0;
                }
            }



            bw.write(String.valueOf(result));
            bw.write("\n");
            bw.flush();

        }



    }

}