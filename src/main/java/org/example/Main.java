package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;


public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static HashMap<Character, Integer> data = new HashMap<>();

    public static String str;

    public static String result;

    public static void main(String[] args) throws IOException {

        input();
        solve();
        output();

    }

    public static void solve(){
        StringBuilder sb = new StringBuilder();

        int count = 0;
        char latchar = 0;

        for (int i = 'A'; i <= 'Z'; i++) {
            if (data.get((char) i) == null) {
                continue;
            } else {
                if (data.get((char) i) % 2 == 0) {
                    // 짝수

                    int loop = data.get((char) i) / 2;
                    for (int j = 0; j < loop; j++) {
                        sb.append((char)i);
                    }

                } else{
                    if (count == 1) {
                        return;
                    }
                    // 홀수
                    count += 1;
                    latchar = (char)i;

                    int loop = data.get((char) i) / 2;
                    for (int j = 0; j < loop; j++) {
                        sb.append((char)i);
                    }
                }

            }
        }

        if (count == 1) {
            // 홀수
            result = sb.toString() + latchar + sb.reverse().toString();
        } else {
            // 짝수
            result = sb.toString() + sb.reverse().toString();

        }


    }

    public static void input() throws IOException {
        str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (data.get(str.charAt(i)) == null) {
                data.put(str.charAt(i), 1);
            } else {
                data.put(str.charAt(i), data.get(str.charAt(i)) + 1);
            }
        }
    }

    public static void output() throws IOException {
        if (result == null) {
            result = "I'm Sorry Hansoo";
        }

        bw.write(result);
        bw.flush();

    }


}