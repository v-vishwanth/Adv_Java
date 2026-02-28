package com.lpu.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.hibernate.SessionFactory;
////import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import javax.sql.DataSource;
//import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.lpu")
public class MyConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");
        return vr;
    }


}