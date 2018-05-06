package com.example.controller;

import com.example.demo.Person;
import com.example.service.PersonService;
import com.example.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping()
    public List<Person> getPerson() {
        return personService.getPersonList();
    }


    @RequestMapping(value="/Single", method= RequestMethod.GET, produces={MediaType.APPLICATION_XML_VALUE})
    public Person getSinglePerson(){
        return personService.getPerson() ;
    }

    //
}

