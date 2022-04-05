/*
Author: Daniel Ferguson
Auth ID: 3374690
Date: 2/04/2022
Description: Account Class, calculates the user investment
SENG1110 Programming Assignment 1
 */

import java.math.BigDecimal; // used to round vars to 2 dec places
import java.math.RoundingMode;

public class Account
{
    double inv_rate;
    int num_wks;
    int n = 52;
    double inv;
    double t = 1; // if we wanted to calculate investment over multiple years this would be used
 
   // constructor
    public Account()
    {
        
    }
    public double calcInv(){
        double FV; // value of investment, means Future Value
        //TA = inv*(1+(inv_rate/100)/numberOfWeeks)*Math.pow(51,1); // previous attempts at creating algo
        //TA = Math.pow((1+inv_rate/12), 12)+(Math.pow((1+inv_rate/12), 12)-1)/(inv_rate/12);
        //A = ((Math.pow((1+(inv_rate/12)), 12)*inv-1) / (inv_rate/12)) + 5*Math.pow((1+(inv_rate/12)), 12);
        FV = inv*((Math.pow((1+inv_rate/n),(num_wks*t))-1)/(inv_rate/n))*(1+inv_rate/n);
        // a very complicated ( yet far superior) way of finding the compound interest from
        // regular contributions. This was the hardest part of the assignment to create.
        // this formula compounds weekly and can calculate the value from 1 to 52 weeks.
        return new BigDecimal(FV).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
     
    public void setinvRate(double inputRate){ inv_rate = inputRate/100;}
    public double getinvRate()
    {
        return(inv_rate);
    }

    public void setInv(double inputInvestment){ inv = inputInvestment;}
    public double getInv(){return inv;}

    public void setNum_wks(int inputWeeks){
        num_wks = inputWeeks;}
    public int getNum_wks(){return num_wks;}

    
}
