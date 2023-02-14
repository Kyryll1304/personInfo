package com.me.kirilltrosnickii;

public class Person {


    public Person(String name, String surname, String city, int phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    private final String name;
    private final String surname;
    private final String city;
    private final int phone;

    public static void main(String[] args) {
        Person person = new Person("Bilbo", "Baggins", "Mordor", 123456);
        Person person1 = new Person("Thomas", "Anderson", "New-York", 9876543);
        Person person2 = new Person("Kyrylo", "Trosnytskyi", "Odesa", 66997);
        System.out.println(person.personInfo());
        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
    }

    public String personInfo() {
        return "Зателефонувати громадянину " + name + " " + surname + " з міста " + city + " " + "можна за номером " + phone;
    }
}
