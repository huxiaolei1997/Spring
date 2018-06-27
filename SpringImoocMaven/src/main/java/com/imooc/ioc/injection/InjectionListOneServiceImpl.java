package com.imooc.ioc.injection;

/**
 * @author xiaolei hu
 * @date 2018/6/27 20:22
 **/
public class InjectionListOneServiceImpl implements InjectionListOneService {

    @Override
    public void testInjectionList() {
        System.out.println("测试list注入one");
    }
}
