package edu.ijse.config;

import edu.ijse.bean.SpringBeanC;
import edu.ijse.bean.SpringBeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig_03 {
    @Bean
    SpringBeanC springBeanC() {
        System.out.println("SpringBeanC Constructor");
        return new SpringBeanC();
    }

    @Bean
    SpringBeanD springBeanD() {
        System.out.println("SpringBeanD Constructor");
        return new SpringBeanD();
    }
}
