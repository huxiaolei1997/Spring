package com.imooc.ioc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceclient {
    public void go() {
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String advice = bufferedReader.readLine();
            System.out.println("Today you should: " + advice);
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceclient dailyAdviceclient = new DailyAdviceclient();
        dailyAdviceclient.go();
    }
}
