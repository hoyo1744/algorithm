package org.example;


import java.io.*;
import java.util.*;



class Main {

    public static int n;

    public static int m;


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Integer> arr = new ArrayList();

    public static ArrayList<Integer> result = new ArrayList();

    public static boolean[] visit = new boolean[10005];

    public static void main(String[] args) throws IOException {
        input();


        for (int i = 0; i < arr.size(); i++) {
            visit[arr.get(i)] = true;
            result.add(arr.get(i));
            solve(1);
            visit[arr.get(i)] = false;
            result.remove(result.size() - 1);
        }

        wr.flush();

    }

    public static void input() throws IOException {

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt( st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        arr.sort(Comparator.naturalOrder());

    }

    public static void solve(int count) throws IOException{

        if (count == m) {

            for (int i = 0; i < result.size(); i++) {

                wr.write(String.valueOf(result.get(i)));
                wr.write(" ");
            }
            wr.write("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visit[arr.get(i)] == false) {
                visit[arr.get(i)] = true;
                result.add(arr.get(i));
                solve(count + 1);
                visit[arr.get(i)] = false;
                result.remove(result.size() - 1);
            }
        }




    }




}



