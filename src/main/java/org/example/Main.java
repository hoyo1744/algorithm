package org.example;


import java.util.*;
import java.io.*;

class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static ArrayList<Person> list = new ArrayList<>();


    public static class Person implements Comparable<Person>{

        int age;
        String name;
        int seq;

        public Person(int age, String name, int seq){
            this.age = age;
            this.name = name;
            this.seq = seq;
        }


        @Override
        public int compareTo(Person p){
            if ( this.age == p.age){
                return this.seq - p.seq;
            }

            return this.age - p.age;
        }

        @Override
        public String toString(){
            return this.age + " " + this.name;
        }
    }



    public static void  main(String args[]) throws IOException{

        input();
        solve();
        output();

    }

    public static void input() throws IOException{
        String str = br.readLine();

        n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {

            str = br.readLine();

            StringTokenizer st = new StringTokenizer(str);

            int age = Integer.parseInt(st.nextToken());
            int seq = i;
            String name = st.nextToken();

            Person person = new Person(age, name, seq);

            list.add(person);
        }
    }

    public static void solve() {
        list.sort(Comparator.naturalOrder());
    }

    public static void output() throws IOException {
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i).toString());
            bw.write("\n");
        }

        bw.flush();
    }



}

