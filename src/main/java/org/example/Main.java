
package org.example;


import java.io.*;

public class Main {

 public static int n;

 public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 public static int[] sum = new int[10_000_005];

 public static int result;

 public static void output() throws IOException {
  bw.write(String.valueOf(result));
  bw.flush();
 }

 public static void input() throws IOException {
  n = Integer.parseInt(br.readLine());;

  for (int i = 1; i <= n; i++) {
   sum[i] = sum[i-1] + i;
  }
 }

 public static void solve() throws IOException {
  int left = 1;
  int right = 1;

  while (left <= right && right <= n) {
   int cmp = sum[right] - sum[left - 1];

   if (cmp == n) {
    result++;
    right++;
   } else if (cmp < n) {
    right++;
   } else {
    left++;
    if (left > right && left <= n) {
     right = left;
    }
   }
  }
 }

 public static void main(String[] args) throws IOException {

  input();
  solve();
  output();
 }


}