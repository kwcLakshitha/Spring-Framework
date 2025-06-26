package edu.ijse.config;

import edu.ijse.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "edu.ijse.bean")
public class AppConfig {
    //InterBean dependency satisfied
    /*@Bean
    public SpringBeanOne springBeanOne() {
        SpringBeanTwo springBeanTwo1 = springBeanTwo();
        SpringBeanTwo springBeanTwo2 = springBeanTwo();
        System.out.println(springBeanTwo1);
        System.out.println(springBeanTwo2);

        return new SpringBeanOne();
    }
    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }*/
}
