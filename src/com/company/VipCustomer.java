package com.company;


//sets up fields
public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;


//creates default values for fields
    public VipCustomer() {
        this("default Name", 50000, "default@email.com");
    }

    // constructor for when only name and credit limit are known
    public VipCustomer(String name, int creditLimit) {
      this(name, creditLimit, "unknown@email.com");
    }

    //constructor that saves data to fields.
    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

//getters

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
