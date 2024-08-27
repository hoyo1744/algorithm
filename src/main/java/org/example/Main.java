package org.example;


// 알고리즘 기본 import

import java.io.*;
import java.util.*;


class Main {

    public static int n;

    public static int m;

    //   BufferedReader 선언
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //    BufferedWriter 선언
    public static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Integer> arr = new ArrayList();

    public static ArrayList<Integer> result = new ArrayList();

    public static boolean[] visit = new boolean[10005];

    public static void main(String[] args) throws IOException {
//        input();
        orderArrayList();
        orderCollections();
        orderUserCustomUsingComparable();
        orderUserCustomUsingComparator();


    }

    //    BufferedReader를 이용한 Read방법
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

    public static void orderArrayList() throws IOException {

        System.out.println("###OrderArrayList##");


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));


        // ArrayList에서의 오름차순 정렬
        list.sort(Comparator.naturalOrder());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");

        // ArrayList에서의 내림차순 정렬
        list.sort(Comparator.reverseOrder());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");
    }

    public static void orderCollections() {

        System.out.println("###orderCollections##");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

//        Collections를 이용한 오름차순 정렬
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");

//        Collections를 이용한 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");


    }

    public static void orderUserCustomUsingComparable() {

        System.out.println("###orderUserCustomUsingComparable##");
        ArrayList<Fruit> list = new ArrayList<>();

        list.add(new Fruit("Apple", 2000));
        list.add(new Fruit("Orange", 3000));
        list.add(new Fruit("Banana", 1000));

//        Collections는 내부에서 정렬시 Comparable의 compareTo를 이용함.
//        사용자 정의 오름차순 정렬
//        Collections.sort(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

//        사용자 정의 내림차순 정렬
//        Collections.sort(list, Collections.reverseOrder());
        list.sort(Comparator.reverseOrder());
        System.out.println(list);


    }

    public static void orderUserCustomUsingComparator() {
        System.out.println("###orderUserCustomUsingComparator##");
        ArrayList<Fruit> list = new ArrayList<>();

        list.add(new Fruit("Apple", 2000));
        list.add(new Fruit("Orange", 3000));
        list.add(new Fruit("Banana", 1000));


        // 오름차순
        list.sort(new FruitPrice());
        System.out.println(list);

        // 내림차순
        list.sort(new FruitPrice().reversed());
        System.out.println(list);


    }

    static class FruitPrice implements Comparator<Fruit> {

        @Override
        public int compare(Fruit f1, Fruit f2) {
            if (f1.price > f2.price) {
                return 1;
            } else if (f1.price < f2.price) {
                return -1;
            } else {
                return 0;
            }
        }
    }


    static class Fruit implements Comparable<Fruit> {

        private String name;
        private int price;

        public Fruit(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public int compareTo(Fruit fruit) {
            if (fruit.price < price) {
                return 1;
            } else if (fruit.price > price) {
                return -1;
            } else {
                return 0;
            }
        }

        @Override
        public String toString() {
            return "[" + this.name + ": " + this.price + " ]";
        }
    }


}



