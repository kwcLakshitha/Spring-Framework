package edu.ijse;

import edu.ijse.bean.MyConnection;
import edu.ijse.bean.TestBean;
import edu.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        TestBean testBean = context.getBean(TestBean.class);
        System.out.println(testBean);

        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println(myConnection);

        System.out.println("-----------------------------------------------\n\n");

        MyConnection myConnection2 = context.getBean(MyConnection.class);
        System.out.println(myConnection2);

        context.registerShutdownHook();

    }
}