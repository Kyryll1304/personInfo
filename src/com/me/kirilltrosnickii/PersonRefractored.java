package com.me.kirilltrosnickii;

public class PersonRefractored {
    public static String personInfo(String name, String surname, String city, int phone, int quantity) {
        String result;
        if (quantity > 1) {
            result = String.format("You can call to persons %s %s from %s using phone number %s", name, surname, city, phone);
        } else {
            result = String.format("You can call to person %s %s from %s using phone number %s", name, surname, city, phone);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(personInfo("Kyrylo", "Trosnytskyi", "Odesa", 12345567, 1));
        System.out.println(personInfo("Thomas", "Anderson", "New-York", 1010101010, 1));
        System.out.println(personInfo("James", "Hetfield", "Chicago", 19841986, 2));

    }
}
