package com.imooc.ioc.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {"Take smaller bites",
            "Go for the tight jeans. No they go NOT make you look fat.",
            "One word: inappropriate",
            "Just for today, be honest. Tell your boss what you *really* think",
            "You might want to rethink that haircut."};

    public void go() {
        try {
            // ServerSocket 会监听客户端对这台机器在 4242 端口上的请求
            ServerSocket serverSocket = new ServerSocket(4242);
            // 服务器进入无穷循环等待客户端的请求
            while (true) {
                // accept()方法会在等待用户Socket连接时闲置着。当用户连接上来时，此方法会返回一个Socket（在不同的端口上）以便与客户端通信
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer dailyAdviceServer = new DailyAdviceServer();
        dailyAdviceServer.go();
    }
}
