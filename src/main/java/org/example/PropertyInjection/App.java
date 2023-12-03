package org.example.PropertyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property-injection-config.xml");

        // doctor bean
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor);

        System.out.println();

        Nurse nurse = context.getBean(Nurse.class);
        nurse.assist();
        System.out.println(nurse);

        System.out.println();

        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);
    }
}
