package com.huben.c1_3.s7.p1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 12306);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();

        out.write("客户端发送的信息".getBytes());

        byte[] bytes = new byte[1024];
        int len = in.read(bytes);
        System.out.println(new String(bytes, 0, len));

        socket.close();
    }
}
