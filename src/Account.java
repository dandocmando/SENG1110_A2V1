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
    public double calcInv(){
        double A;
        //TA = inv*(1+(inv_rate/100)/numberOfWeeks)*Math.pow(51,1);
        //TA = Math.pow((1+inv_rate/12), 12)+(Math.pow((1+inv_rate/12), 12)-1)/(inv_rate/12);
        A = ((Math.pow((1+(inv_rate/12)), 12)*inv-1) / (inv_rate/12)) + 5*Math.pow((1+(inv_rate/12)), 12);
        return A;
    }
     
    public void setinvRate(double inputRate){ inv_rate = inputRate/100;}
    public double getinvRate()
    {
        return(inv_rate);
    }

    public void setInv(double inputInvestment){ inv = inputInvestment;}
    public double getInv(){return inv;}

    public void setNumberOfWeeks(int inputWeeks){numberOfWeeks = inputWeeks;}
    public int getNumberOfWeeks(){return numberOfWeeks;}

    
}
