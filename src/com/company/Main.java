package com.company;

public class Main {

    public static void main(String[] args) {
        //calling constructor to populate initial data
	Account action = new Account(25455221, 2500, "John Smith",
            "jsmith@email.com", "(125) 254-2542" );



//adds 400 to the account balance
	action.addBalance(400);

//withdraws 200 from account balance
    action.subtractBalance(200);

//checks the NSF validation
    action.subtractBalance(1000);

//displays current balance
    action.printBalance();

    //testing constructor with only default params
    VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        //testing constructor for when only a name and credit limit are defined;
    VipCustomer person2 = new VipCustomer("Jake", 25000);
        System.out.println(person2.getName());

       //testing parameter when all three params are defined.
    VipCustomer person3 = new VipCustomer("Mark", 100000, "mark@marksemail.com");
        System.out.println(person3.getName());


    }

}
