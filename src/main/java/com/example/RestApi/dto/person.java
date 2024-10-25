package com.example.RestApi.dto;

public class person   {
    private String name;

    private String city;
    private String gender;
    private String education;
    private int age;

    public person(String name, String city, String gender, String education, int age) {
        this.name = name;
        this.city = city;
        this.gender = gender;
        this.education = education;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", education='" + education + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
