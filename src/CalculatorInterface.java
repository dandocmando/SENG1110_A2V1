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
    Client client = new Client();
    Account account = new Account();
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
        System.out.println("Maximum possible investment weekly: $"+client.calcPossibleInvestment());
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
                System.out.println("Investment value accepted.");
                account.setInv(inv);
            }
        }

        System.out.print("Enter the investment rate as a %: ");
        double inv_rate;
        inv_rate = console.nextDouble();
        account.setinv_Rate(inv_rate);

        System.out.println("Would you like to invest for an entire year?");
        System.out.print("Enter Y or N: ");
        String invest_year = console.next();

        if(Objects.equals(invest_year, "Y")){
            account.setNum_wks(52); // assigns weeks to 52 as that is an entire year in wks
        }
        else{
            System.out.print("Enter the number of weeks you would like to invest for: ");
            int invest_weeks = console.nextInt();
            account.setNum_wks(invest_weeks);
        }

        System.out.println("\nInvestment value after "+account.getNum_wks()+" weeks: $"+account.calcInv());
     }
    
  
    public static void main(String[] args)
    {
        CalculatorInterface calc = new CalculatorInterface();
        calc.run();
    }
}
        
    

    
    
    
    
    
    
    


        

	