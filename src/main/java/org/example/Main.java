package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static Deque<Pair> dq = new ArrayDeque<>();

    public static int n;

    public static class Pair{
        public int index;
        public int value;

        Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }


    }


    public static void main(String[] args) throws IOException{

        n = Integer.parseInt(br.readLine());

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        for (int i = 0; i < n; i++) {
            dq.addLast(new Pair(i + 1, Integer.parseInt(st.nextToken())));
        }

        Pair value = dq.removeFirst();
        bw.write(String.valueOf(value.index) + " ");


        while (true) {

            if (dq.isEmpty()) {
                break;
            }

            if (value.value > 0) {
                for (int i = 1; i < value.value; i++) {
                    dq.addLast(dq.removeFirst());
                }
            } else {
                for (int i = 1; i < value.value * -1; i++) {
                    dq.addFirst(dq.removeLast());
                }
            }

            if (value.value > 0) {
                value = dq.removeFirst();
            } else {
                value = dq.removeLast();
            }


            bw.write(String.valueOf(value.index) + " ");
        }

        bw.flush();



    }
}

