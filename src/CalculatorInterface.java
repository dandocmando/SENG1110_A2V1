/*
Author: Daniel Ferguson
Auth ID: 3374690
Date: 2/04/2022
Description: Calculator Interface Class
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

     }
    
  
    public static void main(String[] args)
    {
        CalculatorInterface calc = new CalculatorInterface();
        calc.run();
    }
}
        
    

    
    
    
    
    
    
    


        

	