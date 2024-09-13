package org.example;


import java.util.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static HashMap<String, Boolean> check = new HashMap<>();

    public static int n;

    public static ArrayList<Str> list = new ArrayList<>();

    public static class Str implements Comparable<Str>{
        String msg;

        public Str(String msg) {
            this.msg = msg;
        }

        @Override
        public int compareTo(Str s1) {

            if (this.msg.length() == s1.msg.length()) {
                return this.msg.compareTo(s1.msg);
            }

            return this.msg.length() - s1.msg.length();

        }

    }


    public static void main(String[] args)  throws IOException{

        input();
        solve();
        output();
    }

    public static void input() throws IOException {

        String str = br.readLine();
        StringTokenizer st  = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);

            String msg = st.nextToken();
            Str temp = new Str(msg);

            list.add(temp);
        }
    }

    public static void solve() {
        list.sort(Comparator.naturalOrder());
    }

    public static void output() throws IOException{

        for (int i = 0; i < list.size(); i++) {
            Boolean c = check.get(list.get(i).msg);
            if (c == null) {
                bw.write(list.get(i).msg);
                bw.write("\n");
            }

            check.put(list.get(i).msg, true);
        }

        bw.flush();

    }



}

