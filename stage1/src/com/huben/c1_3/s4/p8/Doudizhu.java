package com.huben.c1_3.s4.p8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Doudizhu {
    public static void main(String[] args) {

        HashMap<Integer,String> poker= new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        List<String> colors = List.of("♦","♥","♣","♠");
        List<String> numbers = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");

        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index++);
        poker.put(index,"小王");
        pokerIndex.add(index++);

        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index++);
            }
        }

        System.out.println(poker);
        System.out.println(pokerIndex);

        Collections.shuffle(pokerIndex);

        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> o = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i>50){
                o.add(in);
            }else if (i%3==0){
                p1.add(in);
            }else if (i%3==1){
                p2.add(in);
            }else if (i%3==2){
                p3.add(in);
            }
        }

        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(o);

        look(poker,p1);
        look(poker,p2);
        look(poker,p3);
        look(poker,o);


    }

    private static void look(HashMap<Integer, String> poker, ArrayList<Integer> list){

        for (Integer integer : list) {
            System.out.print(poker.get(integer) +" ");
        }
        System.out.println();
    }
}
