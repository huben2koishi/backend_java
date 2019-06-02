package com.huben.c1_3.s1.p5;

public class Demo06StringConvert {
    public static void main(String[] args) {

        // public char[] toCharArray() 将字符串拆分为字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[1]);
        System.out.println(chars.length);

        // public byte[] getBytes() 将字符串拆分为字节数组
        byte[] bytes = "abcd".getBytes();
        for (byte b : bytes) {
            System.out.print(b + " ");
        }

        // public String replace(CharSequence oldString, CharSequence newString) 将老字符串替换为新字符串
        String str = "How do you do ?";
        System.out.println(str.replace("o","*"));

    }
}
