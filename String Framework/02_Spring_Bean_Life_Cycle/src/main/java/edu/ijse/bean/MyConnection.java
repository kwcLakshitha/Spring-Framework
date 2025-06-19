package edu.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements DisposableBean, BeanNameAware , BeanFactoryAware , ApplicationContextAware , InitializingBean {

    // The state of instantiation
    public MyConnection () {
        System.out.println("MyConnection Constructor");
    }


    // bean name aware - > bean ID
    @Override
    public void setBeanName(String name) {
        System.out.println("MyConnection setBeanName" );
    }


    // bean Factory aware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection setBeanFactory");
    }


    // bean context aware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection setApplicationContext");
    }


    // Bean Initialization
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection afterPropertiesSet");
    }


    // Disposable bean
    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection destroy");
    }
}
