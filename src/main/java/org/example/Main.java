package org.example;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


class Main {

    public static int n;

    public static HashMap<String, Boolean> visit = new HashMap<>();

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



    public static void main(String[] args) throws IOException{
        String str = br.readLine();

        n = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            str = br.readLine();

            StringTokenizer st = new StringTokenizer(str);


            String name = st.nextToken();

            String log = st.nextToken();


            if (log.equals("enter")) {
                visit.put(name, true);
            } else {
                visit.remove(name);
            }
        }


        Set<String> names = visit.keySet();

        List<String> result = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        if (result.size() != 0) {
            for (int i = 0; i < result.size(); i++) {
                bw.write(result.get(i));
                bw.write("\n");
            }

            bw.flush();

        }





    }




}

