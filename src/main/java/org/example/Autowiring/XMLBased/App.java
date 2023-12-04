package org.example.Autowiring.XMLBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlbasedautowiringconfig.xml");
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

    }
}
