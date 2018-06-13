package com.imooc.ioc.test;

/**
 * @author xiaolei hu
 * @date 2018/6/13 21:51
 **/
public class LambdaTest {
    //private static String Hi = "Hi";
    //String Hi = "Hi";

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        // 这个 lambda 表达式返回了一个实现了MathOperation接口的类，这个类实现了其中的operation方法
        MathOperation mathOperation = (a, b) -> a + b;
        MathOperation mathOperation1 = (a, b) -> a - b;
        System.out.println(mathOperation.operation(5, 1));
        System.out.println(mathOperation1.operation(5, 1));
        System.out.println(lambdaTest.operate(5, 1, mathOperation));
        System.out.println(lambdaTest.operate(5, 1, mathOperation1));
        int test = 1;
        //String Hi;
        GreetingService greetingService = message -> {
            final String Hi = "Hi";
            System.out.println(Hi + "Hello " + message);
        };
        greetingService.sayMessage("Google");
        greetingService.sayMessage("Alibaba");
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
