package org.example;


import java.io.*;
import java.util.*;
import java.util.stream.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static Queue<Integer> q = new LinkedList<>();

    public static Stack<Integer> s = new Stack<>();


    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        n = Integer.parseInt(str);


        str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            q.add(value);
        }

        int start = 1;

        while (true) {

            if (start == n) {
                break;
            }

            if (!s.isEmpty()) {
                int stackValue = s.peek();
                if (stackValue == start) {
                    s.pop();
                    start++;
                    continue;
                } else {
                    if (q.isEmpty()) {
                        start = -1;
                        break;
                    }
                }
            }

            if (!q.isEmpty()) {
                int qValue = q.peek();
                if (qValue == start) {
                    q.remove();
                    start++;
                    continue;
                } else {
                    if (q.isEmpty()) {
                        start = -1;
                        break;
                    }
                    Integer remove = q.remove();
                    s.add(remove);
                }
            }



        }

        if (start == n) {
            bw.write("Nice\n");
        } else {
            bw.write("Sad");
        }

        bw.flush();









    }


}

