/*
Author: Daniel Ferguson
Auth ID: 3374690
Date: 2/04/2022
Description: Client Class
SENG1110 Programming Assignment 1
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Client
{
    private String name;                     
    private Account savingAccount;
    double grossSalary;
    double netSalary;
    double weeklyGross;
    double weeklyTax;
    double weeklyNet;
    boolean resident;
    //double tax;
    double medicare;
    double weeklyExpenses;
    double ctx;

    public Client()
    {

    }
    public double calcTax() {
        //double ctx = 0; // calculate tax bracket is the expanded name
        if(resident) {
            if(grossSalary > 180001){
                ctx = (grossSalary-180000)*0.45 + 51667;
            }
            else if(grossSalary >= 120001 && grossSalary <= 180000){
                ctx = (grossSalary-120000)*0.37 + 29467;
            }
            else if(grossSalary >= 45001 && grossSalary <= 120000){
                ctx = (grossSalary-45000)*0.325 + 5092;
            }
            else if (grossSalary > 18200) {
                ctx = (grossSalary - 18200) * 0.19;
            }
        }

        if(!resident) {
            if(grossSalary > 180001){
                ctx = (grossSalary-180000)*0.45 + 61200;
            }
            else if(grossSalary >= 120001 && grossSalary <= 180000){
                ctx = (grossSalary-120000)*0.37 + 39000;
            }
            else if(grossSalary <= 120000){
                ctx = grossSalary*0.325;
            }
        }
        return ctx;
    }

    public double calcMedicare(){
        if(resident){ // only calculates medicare if they are a resident
            medicare = grossSalary*0.02;  //sets medicare var to 2% of gross (taxable) income
        }
        return medicare;
    }

    // calculates net by deducting medicare and tax
    public double calcNet(){netSalary = grossSalary-(calcMedicare()+calcTax()); return netSalary;}

    //calculates weekly gross by dividing yearly gross by 52
    public BigDecimal calcWeeklyGross(){
        weeklyGross = grossSalary/52;
        return new BigDecimal(weeklyGross).setScale(2, RoundingMode.HALF_EVEN);
    }
    //calculates weekly tax by dividing yearly tax by 52
    public BigDecimal calcWeeklyTax(){
        weeklyTax = calcTax()/52;
        return new BigDecimal(weeklyTax).setScale(2, RoundingMode.HALF_EVEN);
    }
    //public double calcWeeklyTax(){weeklyTax = calcTax()/52; return weeklyTax;}

    public BigDecimal calcWeeklyNet(){
        weeklyNet = (grossSalary-(calcMedicare()+calcTax()))/52;
        return new BigDecimal(weeklyNet).setScale(2,RoundingMode.HALF_EVEN);
    }

    public String getName(){ return (name);} //gets name, used in calcinf
    public void setName(String inputName){name = inputName;} // sets name, takes input and assigns to var

    public double getGross(){ return (grossSalary);} // gets gross income, used in calcinf
    public void setGross(double inputGross){grossSalary = inputGross;}  // sets gross, takes input from calcinf

    public boolean getResident(){ return (resident);}
    public void setResident(boolean inputResident){resident = inputResident;}


    
}
