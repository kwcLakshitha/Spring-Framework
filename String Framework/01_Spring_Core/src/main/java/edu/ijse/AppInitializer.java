package edu.ijse;

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

        SpringBean springBean = context.getBean(SpringBean.class);
        springBean.text();

        System.out.println(springBean + "  springBean");

        SpringBean Bean = context.getBean(SpringBean.class);
        System.out.println(Bean + "  bean");

        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1 + "  testBean1");

        TestBean2 testBean2 = context.getBean(TestBean2.class);
        System.out.println(testBean2 + "  testBean2");

        context.close();
    }
}