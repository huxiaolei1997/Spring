package com.imooc.ioc.test;

import java.io.*;
import java.net.URL;

public class ReadFile {
    public static void main(String[] args) {
        //ReadFile readFile = new ReadFile();
        //URL filePath = ReadFile.class.getClassLoader().getResource("test.txt");
        String filePath = "D:\\Spring\\SpringImoocMaven\\target\\test-classes\\test.txt";
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            //InputStream inputStream = ReadFile.class.getResourceAsStream("/test.txt");
            //InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            //while (reader = fileReader.readline)
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        //System.out.println(filePath);
        // System.out.println(ReadFile.class.getClassLoader().getResource("test.txt"));
        getPath();
    }

    public static void getPath() {
        //方式一
        System.out.println(System.getProperty("user.dir"));
        //方式二
        File directory = new File("");//设定为当前文件夹
        try {
            System.out.println(directory.getCanonicalPath());//获取标准的路径
            System.out.println(directory.getAbsolutePath());//获取绝对路径
        } catch (Exception e) {
            e.printStackTrace();
        }
        //方式三
        System.out.println(ReadFile.class.getResource("/"));
        System.out.println(ReadFile.class.getResource(""));
        //方式4
        System.out.println(ReadFile.class.getClassLoader().getResource(""));
        System.out.println(ReadFile.class.getClassLoader().getResource("test.txt"));
    }
}
