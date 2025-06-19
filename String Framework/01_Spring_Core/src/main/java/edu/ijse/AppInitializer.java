package edu.ijse;

import edu.ijse.bean.MyConnection;
import edu.ijse.bean.SpringBean;
import edu.ijse.bean.TestBean1;
import edu.ijse.bean.TestBean2;
import edu.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        // getBean( ) -> class

        SpringBean springBean = context.getBean(SpringBean.class);
        springBean.text();

        System.out.println(springBean + "  springBean");

        // getBean( ) -> class

        SpringBean Bean = context.getBean(SpringBean.class);
        System.out.println(Bean + "  bean");

        // getBean( ) -> class

        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1 + "  testBean1");



//        TestBean2 testBean2 = context.getBean(TestBean2.class);
//        System.out.println(testBean2 + "  testBean2");

        // getBean( ) -> id

//        TestBean2 testBean2 = (TestBean2) context.getBean("testBean2");
//        System.out.println(testBean2 + "  testBean2");


        // getBean( ) -> id & class

        TestBean2 testBean2 = (TestBean2) context.getBean(TestBean2.class ,"testBean2");
        System.out.println(testBean2 + "  testBean2");


        // bean method name eka use karanawa --> myConnection

        MyConnection myConnection = (MyConnection) context.getBean("myConnection");
        System.out.println(myConnection + "  myConnection");

        context.registerShutdownHook();

    }
}