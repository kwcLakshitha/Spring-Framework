package edu.ijse.bean;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBean2 {
    TestBean2() {
        System.out.println("TestBean2()");
    }
}
