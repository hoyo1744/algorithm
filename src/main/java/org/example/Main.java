package org.example;



import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;

    public static int m;

    public static HashMap<String, Integer> check = new HashMap<>();

    public static ArrayList<String> resultName = new ArrayList<>();

    public static int resultCount;



    public static void main(String[] args) throws IOException{

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        n = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(st.nextToken());


        for (int i = 0; i < n; i++) {
            str = br.readLine();
            check.put(str, 1);
        }

        for (int i = 0; i < m; i++) {
            str = br.readLine();


            Integer count = check.get(str);

            if (count == null) {
                check.put(str, 1);
            } else {
                check.put(str, count + 1);
            }
        }

        Set<String> keys = check.keySet();

        List<String> keyList = keys.stream().collect(Collectors.toList());



        for (int i = 0; i < keyList.size(); i++) {
            String key = keyList.get(i);

            if (check.get(key) >= 2) {
                resultName.add(key);
            }
        }

        resultCount = resultName.size();


        resultName.sort(Comparator.naturalOrder());

        bw.write(String.valueOf(resultCount));
        bw.write("\n");

        for (int i = 0; i < resultCount; i++) {

            bw.write(resultName.get(i));
            bw.write("\n");
        }

        bw.flush();



    }


}

