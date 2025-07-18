package edu.ijse.bean;

import org.springframework.context.annotation.Bean;

public class SpringBeanThree {

    //InterBean dependency not satisfied
    @Bean
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
    }
}
