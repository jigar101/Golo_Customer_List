package com.example.jigar.customerlist;package [YOUR PACKAGE NAME];

/**
 * @author Abhishek Vadnerkar
 */

public class Customer {
    private String name;
    private String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
