package com.me.kirilltrosnickii;

public class Person {
    String personName;
    String personSurname;
    String personCity;
    int personPhone;

    public Person(String name, String surname, String city, int phone) {
        personName = name;
        personSurname = surname;
        personCity = city;
        personPhone = phone;
    }

    public static void main(String[] args) {
        System.out.println(personInfo("Kyrylo", "Trosnytskyi", "Odesa", 12345678));
        System.out.println(personInfo("Bilbo", "Baggins", "Mordor", 12345678));
        System.out.println(personInfo("Mister", "Bombastic", "Bombafantastic", 12345678));
    }

    public static String personInfo(String name, String surname, String city, int phone) {
        Person obj = new Person(name, surname, city, phone);
        String result = String.format("You can call to person %s %s from city %s with number %s", obj.personName, obj.personSurname, obj.personCity, obj.personPhone);
        return result;
    }
}
