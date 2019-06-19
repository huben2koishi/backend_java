package com.huben.c1_3.s7.p1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12306);

        Socket accept = serverSocket.accept();

        InputStream in = accept.getInputStream();
        OutputStream out = accept.getOutputStream();

        byte[] bytes = new byte[1024];
        int len = in.read(bytes);

        System.out.println(new String(bytes, 0, len));

        out.write("服务器返回的数据".getBytes());

        accept.close();
        serverSocket.close();

    }
}
