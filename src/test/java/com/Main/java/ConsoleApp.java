package com.Main.java;

import com.customclass.java.HelloBean;
import com.AppConfig.java.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConsoleApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Bean
        HelloBean messageBean = context.getBean(HelloBean.class);

        // Print Message
        System.out.println("Message: " + messageBean.getMessage());
    }
}
