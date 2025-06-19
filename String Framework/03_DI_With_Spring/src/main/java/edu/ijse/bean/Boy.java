package edu.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Autowired  // new Girl(); --> auto initialized
            @Qualifier("girl1")
    Agreement girl;
    Boy() {
        System.out.println("Boy Constructor");
    }
    public void chatWithGirl() {
        girl.chat();
    }
}
