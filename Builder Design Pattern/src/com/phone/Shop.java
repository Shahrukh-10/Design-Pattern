package com.phone;

public class Shop {
    //WE USE BUILDER DESIGN PATTERN IF WE HAVE MULTIPLE ARGUMENT IN CONSTRUCTOR

    public static void main(String[] args) {

        Phone obj = new PhoneBuilder().setOs("Android").setRam(8).getPhone();

        System.out.println(obj.toString());

    }

}
