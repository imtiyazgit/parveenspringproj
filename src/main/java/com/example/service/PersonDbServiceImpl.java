package com.example.service;

import com.example.demo.Person;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public class PersonDbServiceImpl implements PersonService {
    @Override
    public List<Person> getPersonList() {
        return Arrays.asList(new Person("6","6","6"));
    }

    @Override
    public Person getPerson() {
        return new Person("3","35","ad3");
    }
}
