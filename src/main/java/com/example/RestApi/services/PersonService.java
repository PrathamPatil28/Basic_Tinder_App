package com.example.RestApi.services;


import com.example.RestApi.dto.person;

import java.util.List;

public interface PersonService {

    List<person> getAlldata();

    List<person> filterDataBasedonGen(List<person> personList) ;


}
