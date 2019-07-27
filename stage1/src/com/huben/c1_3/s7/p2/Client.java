package com.huben.c1_3.s7.p2;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("stage1/src/com/huben/c1_3/p7/p2/client/a.txt");

        Socket socket = new Socket("127.0.0.1",12345);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        int len;
        byte[] b = new byte[1024];
        while ((len = fis.read(b))!=-1){
            outputStream.write(b,0,len);
        }

        socket.shutdownOutput();


        while ((len=inputStream.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }

        fis.close();
        socket.close();

    }
}
