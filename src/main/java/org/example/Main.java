package org.example;



import java.util.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;
    public static int m;

    public static HashMap<Integer, Integer> datas = new HashMap<>();




    public static void main(String[] args) throws IOException{

        String str = br.readLine();
        n = Integer.parseInt(str);


        str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(st.nextToken());

            Integer count = datas.get(num);

            if (count == null) {
                datas.put(num, 1);
            } else {
                datas.put(num, count+1);
            }
        }

        str = br.readLine();

        m = Integer.parseInt(str);

        str = br.readLine();
        st = new StringTokenizer(str);

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            Integer data = datas.get(num);

            if (data == null) {
                bw.write("0");
            } else {
                bw.write(String.valueOf(data));
            }
            bw.write(" ");
        }

        bw.flush();


    }




}

