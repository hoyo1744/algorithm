package org.example;

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {

        String str = br.readLine();
        int len = str.length();

        int startIndex = 0;
        while (true) {
            if (startIndex + 9 < len) {
                bw.write(str.substring(startIndex, startIndex + 10) + "\n");
            } else {
                bw.write(str.substring(startIndex) + "\n");
                break;
            }

            startIndex += 10;

        }

        bw.flush();

    }


}