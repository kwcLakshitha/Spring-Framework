package edu.ijse.config;


import edu.ijse.bean.MyConnection;
import edu.ijse.bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "edu.ijse.bean")

public class AppConfig {
    @Bean
    @Scope("prototype")
    public MyConnection getMyConnection() {
        return new MyConnection();
    }
}
