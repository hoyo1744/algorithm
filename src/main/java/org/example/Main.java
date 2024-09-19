package org.example;


import java.util.*;
import java.util.stream.*;
import java.io.*;



class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int a;

    public static int b;

    public static Set<Integer> aSet = new HashSet<>();

    public static Set<Integer> bSet = new HashSet<>();

    public static int result;

    public static boolean binarySearch(int value, ArrayList<Integer> list, int maxValue) {

        int left = 0;

        int right = maxValue;

        while (left <= right) {
            int mid = left + ( right - left) / 2;

            if (value < list.get(mid)) {
                right = mid - 1;

            } else if (value > list.get(mid)) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        String aStr = br.readLine();
        st = new StringTokenizer(aStr);
        for (int i = 0; i < a; i++) {

            int aNum = Integer.parseInt(st.nextToken());
            aSet.add(aNum);
        }

        String bStr = br.readLine();
        st = new StringTokenizer(bStr);
        for (int i = 0; i < b; i++) {

            int bNum = Integer.parseInt(st.nextToken());
            bSet.add(bNum);
        }

        ArrayList<Integer> aList = (ArrayList<Integer>)aSet.stream().collect(Collectors.toList());
        ArrayList<Integer> bList = (ArrayList<Integer>)bSet.stream().collect(Collectors.toList());

        aList.sort(Comparator.naturalOrder());
        bList.sort(Comparator.naturalOrder());

        for (int i = 0; i < aList.size(); i++) {
            int value = aList.get(i);

            int maxValue = bList.size() - 1;

            if (false == binarySearch(value, bList, maxValue)) {
                result++;
            }
        }

        for (int i = 0; i < bList.size(); i++) {
            int value = bList.get(i);

            int maxValue = aList.size() - 1;

            if (false == binarySearch(value, aList, maxValue)) {
                result++;
            }


        }


        bw.write(String.valueOf(result));
        bw.flush();







    }



}

