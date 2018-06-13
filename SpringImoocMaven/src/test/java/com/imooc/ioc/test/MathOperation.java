package com.imooc.ioc.test;

/**
 * 当一个接口只有一个抽象方法时，我们需要这个接口的一个对象时，就可以使用lambda表达式来获取，这种接口就称为函数式接口，MathOperation就是一个函数式接口
 * ，因为它只有一个抽象方法 operation()，一般来说接口中不能有具体的方法体，但是在Java8中，可以出现定义方法体。
 *
 * @author xiaolei hu
 * @date 2018/6/13 21:51
 **/
public interface MathOperation {
    int operation(int a, int b);

    // Java8及以上的版本可以定义方法体，这样写不会报编译错误，因为这个方法实际上并不算是抽象方法，因为它有具体的方法体，所以这个接口还算是函数式接口
    default int addition(int a, int b) {
        return a + b;
    }

    //int show();
}
