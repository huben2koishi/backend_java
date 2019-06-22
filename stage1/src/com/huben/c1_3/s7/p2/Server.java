package com.huben.c1_3.s7.p2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);

        while (true) {

            Socket accept = serverSocket.accept();

            new Thread(() -> {
                try {
                    InputStream inputStream = accept.getInputStream();
                    OutputStream outputStream = accept.getOutputStream();

                    File file = new File("stage1/src/com/huben/c1_3/s7/p2/server");
                    if (!file.exists()) {
                        file.mkdirs();
                    }

                    Date date = new Date();
                    DateFormat df = new SimpleDateFormat("hhmmss");
                    String time = df.format(date);
                    FileOutputStream fos = new FileOutputStream(file + "\\a-" + time + ".txt");

                    int len;
                    byte[] b = new byte[1024];
                    while ((len = inputStream.read(b)) != -1) {
                        fos.write(b, 0, len);
                    }

                    System.out.println("文件已经上传到服务器----" + time);
                    outputStream.write("文件已经上传到服务器".getBytes());

                    fos.close();
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();


        }

        // serverSocket.close();
    }
}
