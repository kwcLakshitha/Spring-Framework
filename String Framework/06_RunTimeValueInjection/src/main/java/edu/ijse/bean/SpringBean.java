package edu.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean { 

    @Autowired(required = false)
    SpringBean(@Value("Lakshitha") String name ,@Value("5") int id, @Value("true") boolean flag) {

        System.out.println("Name : " + name);
        System.out.println("id : " + id);           // parameter count eka wadi nisa me constructor eka run
        System.out.println("flag : " + flag);
    }
    @Autowired(required = false)
    SpringBean(@Value("") String name ,@Value("") int id) {

        System.out.println("Name : " + name);
        System.out.println("id : " + id);
    }
}
