package org.example;



import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int m;

    public static int v;

    public static boolean[][] arr = new boolean[1001][1001];

    public static boolean[] check = new boolean[1001];


    public static ArrayList<Integer> dfsResult = new ArrayList<>();

    public static ArrayList<Integer> bfsResult = new ArrayList<>();

    public static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        input();
        solve();
        output();
    }

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = true;
            arr[b][a] = true;

        }

    }

    public static void solve() {
        dfs(v);
        bfs(v);
    }

    public static void dfs(int idx){

        check[idx] = true;
        dfsResult.add(idx);

        for(int i = 1; i <= n; i++){
            if (arr[idx][i] == true) {
                if(check[i] == false){
                    check[i] = true;
                    dfs(i);
                }
            }
        }
    }

    public static void bfs(int idx) {

        Arrays.fill(check, false);

        check[idx] = true;
        q.add(idx);

        while(q.size() > 0){
            int cur = q.poll();
            bfsResult.add(cur);

            for(int i = 1; i <= n; i++){
                if(arr[cur][i] == true && check[i] == false){
                    check[i]= true;
                    q.add(i);
                }
            }
        }
    }

    public static void output() throws IOException {
        for (int i = 0; i < dfsResult.size(); i++) {
            bw.write(String.valueOf(dfsResult.get(i)) + " ");
        }

        bw.write("\n");

        for (int i = 0; i < bfsResult.size(); i++) {
            bw.write(String.valueOf(bfsResult.get(i)) + " ");
        }

        bw.flush();
    }


}