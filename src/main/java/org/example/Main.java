package org.example;




import java.util.*;
import java.io.*;


class Main {

    public static int n;

    public static int m;

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

    public static ArrayList<Integer> jewels = new ArrayList<>();

    public static long result = Integer.MAX_VALUE;

    public static long maxJewel = Integer.MIN_VALUE;



    public static void main(String[] args) throws IOException{

        input();
        solve();
        output();
    }

    public static void input() throws  IOException{
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            str = br.readLine();
            int value = Integer.parseInt(str);

            if ( value > maxJewel){
                maxJewel = value;
            }

            jewels.add(value);
        }
    }

    public static void solve(){

        long left = 1;

        long right = maxJewel;

        while(left <= right){

            long mid = left + (right - left) / 2;

            long temp = 0;

            for (int i = 0; i < m; i++) {
                temp +=  jewels.get(i)/ mid;

                if (jewels.get(i) % mid != 0) {
                    temp++;
                }
            }

            if (temp <= n) {
                if ( result > mid){
                    result = mid;
                }

                right = mid - 1;
            } else {
                left = mid + 1;


            }

        }


    }

    public static void output() throws IOException{
        bw.write(String.valueOf(result));
        bw.flush();
    }

}

