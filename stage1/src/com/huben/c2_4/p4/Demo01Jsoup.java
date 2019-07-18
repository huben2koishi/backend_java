package com.huben.c2_4.p4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo01Jsoup {
    public static void main(String[] args) throws IOException {
        String path = "stage1/src/com/huben/c2_4/p4/students.xml";
        Document document = Jsoup.parse(new File(path),"utf-8");
        Elements names = document.getElementsByTag("name");

        for (Element e : names){
            System.out.println(e.text() );
        }
    }
}
