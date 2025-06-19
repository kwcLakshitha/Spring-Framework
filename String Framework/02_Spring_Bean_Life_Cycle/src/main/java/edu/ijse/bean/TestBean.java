package edu.ijse.bean;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
    TestBean() {
        System.out.println("TestBean constructor");
    }
}
