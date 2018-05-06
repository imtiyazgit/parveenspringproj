package com.example.service;

import com.example.demo.Person;

import java.util.List;

public interface PersonService {
    List<Person> getPersonList();

    Person getPerson();
}
