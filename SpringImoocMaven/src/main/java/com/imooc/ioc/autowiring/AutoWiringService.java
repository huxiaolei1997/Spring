package com.imooc.ioc.autowiring;

public class AutoWiringService {
    private AutoWiringDAO autoWiringDAO;

    // default-autowire 自动注入 constructor方式
    public AutoWiringService(AutoWiringDAO autoWiringDAO) {
        System.out.println("AutoWiringService");
        this.autoWiringDAO = autoWiringDAO;
    }

    // byName, byType 自动注入方式
    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        System.out.println("setAutoWiringDAO");
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word) {
        this.autoWiringDAO.say(word);
    }
}
