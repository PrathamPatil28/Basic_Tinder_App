package com.example.RestApi.services.impl;

import com.example.RestApi.dto.person;
import com.example.RestApi.services.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceimpl  implements PersonService {


   @Value("${user.gender}")
    String UserGender;

    person Amit = new person("Amnt", "Dehli", "Male","B.Tech" ,21);

    person Sumit = new person("Sumit","Pune","Male","Bsc",23);

    person Neha = new person("Neha","Mumbai","FeMale", "Com",22);

    person Pranavi = new person("Pranavi" ,"Hydrabad","Female","B.com",22);

    person Angle_Priya= new person("Angle_Priya","Mumbai", "Female" , "BCA",23);

    person Lord_Nivesh = new person("Lord_Nivesh", "Palghar","Male", "Networking",2);
     List<person> personList = new ArrayList<>();

    @Override
    public List<person> getAlldata() {
       personList.add(Amit);
        personList.add(Sumit);
        personList.add(Neha);
        personList.add(Pranavi);
        personList.add(Angle_Priya);
        personList.add(Lord_Nivesh);


         return personList;


    }

    @Override
    public List<person> filterDataBasedonGen(List<person> personList) {
         List<person> per =  new ArrayList<>();

         for (person obj : personList){
            if (!UserGender.equalsIgnoreCase(obj.getGender())){
                per.add(obj);
            }
         }
         return  per;
    }




}
