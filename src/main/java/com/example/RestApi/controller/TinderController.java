package com.example.RestApi.controller;


import com.example.RestApi.dto.person;
import com.example.RestApi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")

public class TinderController {

    @Autowired
     PersonService personService;


    @GetMapping("/getPersons/F")
    public List<person>  getAllPerson(){
       List<person> allpersonData =  personService.getAlldata();
       List<person> people = personService.filterDataBasedonGen(allpersonData);

     return  people;
    }

    @GetMapping("/getPerson")
   public List<person> getAllperson(){
        List<person> allPersons = personService.getAlldata();
        return  allPersons;
    }



    @PostMapping("/create-user")

    public person createUser(@RequestBody person persons){
        return  persons;
    }
}
