package org.example;


import java.util.*;
import java.io.*;


class Main {

    public static int n;

    public static int m;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static HashMap<String, String> nameToNum = new HashMap<>();
    public static HashMap<String, String> numToName = new HashMap<>();


    public static void solve() throws IOException{
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            int num = i;

            numToName.put(String.valueOf(i), name);
            nameToNum.put(name, String.valueOf(i));
        }




        for (int i = 1; i <= m; i++) {
            String find = br.readLine();

            if (nameToNum.get(find) != null) {
                bw.write(nameToNum.get(find));
            } else {
                bw.write(numToName.get(find));
            }

            bw.write("\n");
        }

        bw.flush();

    }


    public static void main(String[] args) throws IOException{
        solve();
    }





}

