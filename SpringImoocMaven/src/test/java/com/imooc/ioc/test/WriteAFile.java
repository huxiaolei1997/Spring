package com.imooc.ioc.test;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            URL path = WriteAFile.class.getResource("/");
            FileWriter fileWriter = new FileWriter(path.toString().substring(6) + "/Foo.txt");
            fileWriter.write("hello foo!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
