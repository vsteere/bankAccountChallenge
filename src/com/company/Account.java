package com.company;

public class Account {

    //setting fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    //calling overloaded constructor to populate fields in case they're empty
    public Account() {
        this(1235, 0, "default name", "default email", "default phone");
    }


//setting up new constructor for population of initial data.
    public Account(int accountNumber, double balance, String customerName, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
//print out of populated data
        System.out.println("Accout created. Customer name: " + this.customerName + "; account number: " +
                this.accountNumber+ "; initial balance: " + this.balance + "; customer phone: " + this.phone +
                "; customer phone: " + this.phone);
    }



    //method to add funds
    public void addBalance(double deposit) {
        this.balance = this.balance + deposit;
        System.out.println("Your new balance is " + this.balance);
    }
//method to withdraw funds
    public void subtractBalance(double withdrawal) {

        //checks to see if sufficient funds are available and if not, prints out NSF note
        if(this.balance < withdrawal) {
            System.out.println("Insufficient Funds");
        } else {
            this.balance = this.balance - withdrawal;
            System.out.println("Your new balance is " + this.balance);
        }

    }
//returns current balance
public double getBalance() {
        return this.balance;


    }
    //prints current balance
    public void printBalance() {
        System.out.println("your current balanace is " + this.balance);
    }



}
