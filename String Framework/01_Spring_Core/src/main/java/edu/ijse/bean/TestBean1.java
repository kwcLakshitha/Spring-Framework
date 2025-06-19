package edu.ijse.bean;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBean1 {
    TestBean1(){
        System.out.println("TestBean1()");
    }
}
