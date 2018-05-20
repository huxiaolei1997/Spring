package com.imooc.ioc.test;

import java.io.*;

public class Box implements Serializable {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setWidth(50);
        box.setHeight(30);
        // 序列化对象
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("box.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(box);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 解序列化对象
        try {
            FileInputStream fileInputStream = new FileInputStream("box.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Object one = objectInputStream.readObject();

            Box box2 = (Box) one;
            System.out.println(box2.height + ", " + box2.width);
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
