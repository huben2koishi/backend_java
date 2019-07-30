package com.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;

public class Demo01Jackson {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(18);
        p1.setGender("男");
        p1.setBirthday(new Date());

        ObjectMapper mapper = new ObjectMapper();

        String str = mapper.writeValueAsString(p1);
        System.out.println(str);


        Person p2 = mapper.readValue(str, Person.class);
        System.out.println(p2);

    }
}
