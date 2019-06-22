package com.huben.c1_3.s7.p3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);

        while (true) {
            Socket socket = serverSocket.accept();

            new Thread(()->{
                try {
                    InputStream is = socket.getInputStream();
                    OutputStream os = socket.getOutputStream();

                    os.write("HTTP/1.1 200 OK\r\n".getBytes());
                    os.write("Content-Type:text/html\r\n".getBytes());
                    os.write("\r\n".getBytes());

                    String s = new BufferedReader(new InputStreamReader(is)).readLine().split(" ")[1].substring(1);
                    System.out.println(s);

                    FileInputStream fis = new FileInputStream("stage1/src/com/huben/c1_3/s7/p3/" + s);

                    byte[] bytes = new byte[1024];
                    int len;

                    while ((len = fis.read(bytes)) != -1) {
                        os.write(bytes, 0, len);
                    }

                    socket.shutdownOutput();

                    fis.close();
                    socket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }).start();



        }
        // serverSocket.close();


    }
}
