package edu.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "edu.ijse.bean")
@Import({AppConfig_02.class,AppConfig_03.class})
public class AppConfig_01 {

}
