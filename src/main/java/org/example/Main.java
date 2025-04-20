package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Integer> result = new ArrayList<>();

    public static ArrayList<Integer> result2 = new ArrayList<>();

    public static ArrayList<Integer> dwarfs = new ArrayList<>();

    public static boolean isEnd = false;



    public static void main(String[] args) throws IOException {
        input();
        solve(-1, 0 , 0);
        output();
    }

    public static void input() throws IOException {
        for (int i = 0; i < 9; i++) {
            dwarfs.add(Integer.parseInt(br.readLine()));
        }
    }

    public static void solve(int idx, int count, int sum) {

        if (isEnd) {
            return;
        }

        if (count == 7 && sum == 100 ){
            isEnd = true;
            return;
        }

        for (int i = idx + 1; i < dwarfs.size(); i++) {
            result.add(dwarfs.get(i));
            solve(i, count + 1, sum + dwarfs.get(i));
            if (isEnd) {
                break;
            }
            result.remove(result.size() - 1);
        }
    }

    public static void output() throws IOException {
        result.sort(Comparator.naturalOrder());

        for (int i = 0; i < result.size(); i++) {
            bw.write(String.valueOf(result.get(i))+ "\n");
        }

        bw.flush();
    }



}