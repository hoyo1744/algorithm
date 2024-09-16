package org.example;


import java.io.*;
import java.util.*;


class Main {


    public static int n;

    public static int m;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static HashMap<Integer, Boolean> check = new HashMap<>();

    public static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        n = Integer.parseInt(str);

        str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            check.put(Integer.parseInt(st.nextToken()), true);
        }



        str = br.readLine();
        m = Integer.parseInt(str);

        str = br.readLine();

        st = new StringTokenizer(str);

        while(st.hasMoreTokens()){
            int value = Integer.parseInt(st.nextToken());

            if (check.get(value) != null) {
                result.add(1);
            } else {
                result.add(0);
            }
        }


        for (int i = 0; i < result.size(); i++) {
            bw.write(String.valueOf(result.get(i)) + " ");
        }

        bw.flush();






    }

}

