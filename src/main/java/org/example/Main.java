package org.example;


import java.io.*;
import java.util.*;

class Main {

    public static int n;

    public static int m;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Integer> arr = new ArrayList<>();

    public static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException{

        input();

        for (int i = 0; i < arr.size(); i++) {
            result.add(arr.get(i));
            solve(i, 1);
            result.remove(result.size() - 1);

        }


        bw.flush();

    }

    public static void input() throws IOException {

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        arr.sort(Comparator.naturalOrder());
    }

    public static void solve(int idx, int count) throws IOException {

        if (count == m) {

            for (int i = 0; i < result.size(); i++) {

                bw.write(String.valueOf(result.get(i)));
                bw.write(" ");
            }
            bw.write("\n");
            return ;
        }

        for (int i = idx + 1; i < arr.size(); i++) {
            result.add(arr.get(i));
            solve(i, count + 1);
            result.remove(result.size() - 1);
        }
    }
}



