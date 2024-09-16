package org.example;


import java.util.*;
import java.io.*;


class Main {

    public static int n;
    public static int m;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int result;

    public static HashMap<String, Boolean> s = new HashMap<>();


    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            str = br.readLine();

            s.put(str, true);
        }

        for (int i = 0; i < m; i++) {
            str = br.readLine();

            if (s.get(str) != null) {
                result++;
            }

        }

        bw.write(String.valueOf(result));

        bw.flush();

    }


}

