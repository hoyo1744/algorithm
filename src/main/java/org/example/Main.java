package org.example;



import java.util.*;
import java.util.stream.*;

import java.io.*;

public class Main {

    public static int n;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Person> list = new ArrayList<>();

    public static HashMap<Integer, Integer> map = new HashMap<>();



    static class Person implements Comparable<Person>{
        public int weight;

        public int height;

        public int num;

        public Person(int w, int h, int num) {
            this.weight = w;
            this.height = h;
            this.num = num;
        }

        @Override
        public int compareTo(Person p) {
            if (this.weight > p.weight && this.height > p.height) {
                return 1;
            } else if (this.weight == p.weight && this.height == p.height) {
                return 0;
            } else {
                return -1;
            }
        }


    }


    public static void input() throws IOException {

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int num = i + 1;

            list.add(new Person(w, h, num));

        }
    }

    public static void solve() {

//        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            int downCount = 0; // 나보다 큰 애들 개수
            for (int j = 0; j < n; j++) {
                if( i == j )
                    continue;
                int temp = validation(list.get(i), list.get(j));
               if (temp == -1) {
                   downCount++;
               }
            }

            map.put(list.get(i).num, downCount + 1);

        }
    }

    public static void output() throws IOException {
        for (int i = 1; i <= n; i++) {
            bw.write(String.valueOf(map.get(i)) + " ");
        }
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    public static int validation(Person p1, Person p2) {
        if (p1.weight > p2.weight && p1.height > p2.height) {
            return 1;
        } else if (p1.weight == p2.weight && p1.height == p2.height) {
            return 0;
        } else if (p1.weight < p2.weight && p1.height < p2.height) {
            return -1;
        } else {
            return -100;
        }


    }






}