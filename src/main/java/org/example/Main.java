package org.example;



import java.util.*;
import java.util.stream.*;
import java.io.*;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        int n = Integer.parseInt(str);

        int result = (int)Math.sqrt(n);



        bw.write(String.valueOf(result));

        bw.flush();



    }

}

