package org.example.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-injection-config.xml");
        Addition addition = context.getBean(Addition.class);
        System.out.println(addition);
    }
}
