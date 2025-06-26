package edu.ijse.config;

import edu.ijse.bean.SpringBeanA;
import edu.ijse.bean.SpringBeanB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig_02 {
    @Bean
    SpringBeanA springBeanA() {
        System.out.println("SpringBeanA Constructor");
        return new SpringBeanA();
    }

    @Bean
    SpringBeanB springBeanB() {
        System.out.println("SpringBeanB Constructor");
        return new SpringBeanB();
    }
}
