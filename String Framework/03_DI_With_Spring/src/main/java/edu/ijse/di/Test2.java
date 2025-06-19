package edu.ijse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DIInterface {

    DI di;              //   Property true inject

//    Test2( DI di){
//        this.di = di;                                     //  Constructor true inject
//        System.out.println("Test 2 Constructor");
//    }

    @Override
    @Autowired
    public void injected(DI test1) {                        //  Interface true inject
        this.di = test1;
    }

    public void test(){
          di.say();
    }

//    @Autowired
//    public void setterMethod(DI di){
//        this.di = di;                                     //  SetterMethod true inject
//        System.out.println("setterMethod");
//    }

}
