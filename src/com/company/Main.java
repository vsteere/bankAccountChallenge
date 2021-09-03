package com.company;

public class Main {

    public static void main(String[] args) {
	Account action = new Account();



//adds 400 to the account balance
	action.addBalance(400);

//withdraws 200 from account balance
    action.subtractBalance(200);

//checks the NSF validation
    action.subtractBalance(1000);

//displays current balance
    action.printBalance();


    }

}
