package com.example.service;

import com.example.config.Converter;
import com.example.demo.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Autowired
    Converter converter;

    public List<Person> getPersonList() {
        List<Person> personList = Arrays.asList(
                new Person("1", "32", "ad1"),
                new Person("2", "34", "ad2")
        );

        return personList;
    }

    @Override
    public Person getPerson() {
        Person person= new Person("3","35","ad3");
        if(!converter.isValid(person)) {
            return null;
        }
        return person;
    }
}
