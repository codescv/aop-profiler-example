package com.codescv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by czzha on 11/28/16.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Business bc = (Business) context.getBean("myBusinessClass");
        int r = bc.doOperation();
        bc.doOpWithoutProf();
    }
}
