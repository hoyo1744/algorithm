package org.example;



import java.util.*;
import java.io.*;

class Main {

    public static int n;

    public static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> listNoDuplicated = new ArrayList<>();

    public static HashMap<Integer, Boolean> duplicated = new HashMap<>();

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static HashMap<Integer, Integer> result = new HashMap<>();



    public static void main(String[] args) throws IOException{

        input();
        solve();
        output();

    }


    public static void input() throws  IOException {
        String str = br.readLine();

        n = Integer.parseInt(str);

        str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());

            if(Objects.isNull(duplicated.get(value))){
                duplicated.put(value, true);
                listNoDuplicated.add(value);
            }

            list.add(value);
        }
    }

    public static int binarySearch(int value) {

        int left = 1;
        int right = listNoDuplicated.size() - 1;

        int ret = 0;

        while (left <= right) {

            int mid = left + ( right - left) / 2;

            if (listNoDuplicated.get(mid) == value) {
                ret =  mid;
                break;
            }

            if (listNoDuplicated.get(mid) < value) {
                left = mid + 1;
            } else {

                right = mid - 1;

            }
        }

        return ret;
    }

    public static void solve() {

        // 1. 중복제거된 리스트 정렬
        listNoDuplicated.sort(Comparator.naturalOrder());

        // 2. 중복제거된 리스트에 대해서 이분탐색 결과 : 정답

        for (int i = 0; i < listNoDuplicated.size(); i++) {
            //int idx = binarySearch(listNoDuplicated.get(i));
            result.put(listNoDuplicated.get(i), i);
        }

    }

    public static void output() throws IOException {

        for (int i = 0; i < list.size(); i++) {
            int count = result.get(list.get(i));

            bw.write(String.valueOf(count));
            bw.write(" ");
        }

        bw.flush();

    }




}

