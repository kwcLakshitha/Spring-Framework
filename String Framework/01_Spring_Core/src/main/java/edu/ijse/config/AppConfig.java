package edu.ijse.config;

import edu.ijse.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "edu.ijse.bean")
public class AppConfig {

    @Bean
    public MyConnection myConnection() {
        return new MyConnection();
    }
}
