package com.company;

public class Account {

    //setting fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private double phone;


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
