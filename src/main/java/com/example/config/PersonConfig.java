package com.example.config;

import com.example.service.PersonDbServiceImpl;
import com.example.service.PersonService;
import com.example.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PersonConfig {


    @Autowired
    private Environment environment;

    @Bean
    public PersonService personService() {
        if(environment.getProperty("sourceType").equalsIgnoreCase("db")) {
            return new PersonDbServiceImpl();
        } else {
            return new PersonServiceImpl();
        }
    }
}
