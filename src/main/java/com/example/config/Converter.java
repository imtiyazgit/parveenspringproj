package com.example.config;

import com.example.demo.Person;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    public boolean isValid(Person person) {
        if(person.getAge().equals("30")) {
            return true;
        }
        return false;
    }
}
