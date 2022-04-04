/*
Author: Daniel Ferguson
Auth ID: 3374690
Date: 2/04/2022
Description: Account Class, calculates the user investment
SENG1110 Programming Assignment 1
 */

public class Account
{
    double inv_rate;
    int numberOfWeeks;
    double amount;
    double inv;
 
   // constructor
    public Account()
    {
        
    }
     
    public void setinvRate(double inputRate){ inv_rate = inputRate;}
    public double getinvRate()
    {
        return(inv_rate);
    }

    public void setInv(double inputInvestment){ inv = inputInvestment;}
    public double getInv(){return inv;}

    
}
