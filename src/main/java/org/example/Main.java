package org.example;

import java.util.*;
import java.io.*;

class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int k;

    public static int[] arr = new int[500005];

    public static int[] sorted = new int[500005];

    public static int cnt;

    public static int result = -1;

    public static void merge(int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int idx = left;


        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                sorted[idx++] = arr[i++];
            } else {
                sorted[idx++] = arr[j++];
            }
        }


        if (i > mid) {
            for (int l = j; l <= right; l++) {
                sorted[idx++] = arr[l];
            }
        } else {
            for (int l = i; l <= mid; l++) {
                sorted[idx++] = arr[l];
            }
        }

        for (int l = left; l <= right; l++) {

            arr[l] = sorted[l];

            cnt += 1;
            if (cnt == k) {
                result = arr[l];
            }

        }
    }

    public static void merge_sort(int left, int right) {

        int mid = 0;

        if (left < right) {
            mid =( left + right )/ 2;

            merge_sort(left, mid);
            merge_sort(mid + 1, right);
            merge(left, mid, right);
        }




    }

    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str);
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            arr[i] = value;
        }


        merge_sort(0, n - 1);

        bw.write(String.valueOf(result));
        bw.flush();



    }


}


