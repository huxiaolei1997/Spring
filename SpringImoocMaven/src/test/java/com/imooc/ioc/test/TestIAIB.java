package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/26 21:24
 **/
public class TestIAIB {

//    @Override
//    public void test() {
//        InterfaceA.super.test();
//        //System.out.println("test");
//    }

    private class InnerA implements InterfaceA {
        public void test() {
            System.out.println("InterfaceA");
        }
    }

    private static class InnerB implements InterfaceB {
        @Override
        public void test() {
            System.out.println("InterfaceB");
        }
    }


    public static void main(String[] args) {
        TestIAIB testIAIB = new TestIAIB();
        TestIAIB.InnerA innerA = testIAIB.new InnerA();
        innerA.test();

        TestIAIB.InnerB innerB = new TestIAIB.InnerB();
        innerB.test();


    }
}
