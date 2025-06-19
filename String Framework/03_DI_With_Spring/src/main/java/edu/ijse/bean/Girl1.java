package edu.ijse.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl1 implements Agreement {

    Girl1() {
        System.out.println("Girl Constructor");
    }

    @Override
    public void chat() {
        System.out.println("girl1 chat....");
    }
}
