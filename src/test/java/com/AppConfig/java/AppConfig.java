package com.AppConfig.java;



import com.customclass.java.HelloBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HelloBean helloBean() {
        return new HelloBean();
    }
}


