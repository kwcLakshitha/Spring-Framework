package edu.ijse.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean constructor called");
    }
    public void text() {
        System.out.println("text() called");
    }
}
