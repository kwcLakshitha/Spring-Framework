package edu.ijse.di;

import org.springframework.stereotype.Component;

@Component
public class Test1 implements DI {
    Test1(){
        System.out.println("Test 1 Constructor");
    }
    @Override
    public void say() {
        System.out.println("Test 1 : Hello");
    }
}
