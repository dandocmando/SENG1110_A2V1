/*
Author: Daniel Ferguson
Auth ID: 3374690
Date: 2/04/2022
Description: Calculator Interface Class, outputs all the calculations inside the two other classes.
SENG1110 Programming Assignment 1
 */

import java.util.*;


public class CalculatorInterface
{
    public void run()
    {
        Scanner console = new Scanner (System.in);
	Client client;
        
	client = new Client();
    Account account;
    account = new Account();
        System.out.print("First name: ");
        String first_name = console.next();
        System.out.print("Last Name: ");
        String last_name = console.next();
        String name = first_name+" "+last_name; // due to the silly ban on arrays I have resorted to this boring creation
        client.setName(name);

        System.out.print("Gross income: ");
        double gross = console.nextDouble();
        client.setGross(gross);

        System.out.println(client.getGross());

        System.out.print("Resident: (Enter true or false)");
        boolean resident = Boolean.parseBoolean(console.next());
        client.setResident(resident);

        System.out.println("Name:"+client.getName()+"\n");
        System.out.println("Gross Salary");
        System.out.println("Per week: $"+client.calcWeeklyGross());
        System.out.println("Per Year: $"+client.getGross()+"\n");

        System.out.println("Tax Applied");
        System.out.println("Per week: $"+client.calcWeeklyTax());
        System.out.println("Per year: $"+client.calcTax()+"\n");

        System.out.println("Net Salary");
        System.out.println("Per week: $"+client.calcWeeklyNet());
        System.out.println("Per year: $"+client.calcNet()+"\n");

        System.out.println("Medicare Levy Per Year: $"+client.calcMedicare());

        System.out.println("enter your weekly expenses: ");
        double weeklyExpenses = console.nextDouble();
        client.setWeeklyExpenses(weeklyExpenses);
        System.out.println("Maximum possible investment: $"+client.calcPossibleInvestment());
        System.out.print("Enter desired investment: ");
        double inv = console.nextDouble();

        boolean invAllowed = false;
        while(!invAllowed){
            if( inv > client.calcPossibleInvestment()){
                System.out.print("Please enter an investment below $"+client.calcPossibleInvestment()+": ");
                inv = console.nextDouble();
            }
            else{
                invAllowed = true;
                System.out.println("investment value accepted.");
                account.setInv(inv);
            }
        }

        System.out.println("Enter the investment rate as a %:");
        double inv_rate;
        inv_rate = console.nextDouble();
        account.setinvRate(inv_rate);





     }
    
  
    public static void main(String[] args)
    {
        CalculatorInterface calc = new CalculatorInterface();
        calc.run();
    }
}
        
    

    
    
    
    
    
    
    


        

	