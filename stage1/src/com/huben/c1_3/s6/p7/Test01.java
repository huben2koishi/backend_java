package com.huben.c1_3.s6.p7;

import java.io.*;
import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("stage1/src/com/huben/c1_3/s6/p7/in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("stage1/src/com/huben/c1_3/s6/p7/out.txt"));

        HashMap<String, String> map = new HashMap<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] strings = line.split("\\.");
            map.put(strings[0], strings[1]);
        }

        for (String s : map.keySet()) {
            bw.write(s + "->" + map.get(s));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
