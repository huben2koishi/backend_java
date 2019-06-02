package com.huben.c1_3.s4.p3;

import java.util.ArrayList;
import java.util.Collections;

public class Doudizhu {
    public static void main(String[] args) {

        String[] colors = {"♠", "♣", "♥", "♦"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        ArrayList<String> poker = new ArrayList<>();

        poker.add("大王");
        poker.add("小王");

        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color + number);
            }
        }

        Collections.shuffle(poker);
//        System.out.println(poker);

        ArrayList<String> landlord = new ArrayList<>();
        ArrayList<String> farmer1 = new ArrayList<>();
        ArrayList<String> farmer2 = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i>=51||i%3==0){
                landlord.add(poker.get(i));
            }else if (i%3==1){
                farmer1.add(poker.get(i));
            }else {
                farmer2.add(poker.get(i));
            }
        }

        System.out.println(landlord);
        System.out.println(farmer1);
        System.out.println(farmer2);

    }
}
