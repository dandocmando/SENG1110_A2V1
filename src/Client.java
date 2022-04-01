// You can add extra methods if you think it is necessary

public class Client
{
    private String name;                     
    private Account savingAccount;
    double grossSalary;
    double netSalary;
    boolean resident;
    double tax;
    double medicare;
    double weeklyExpenses;

    public Client()
    {

    }
    public double calcTax() {
        double ctx = 0; // calculate tax bracket 1 is the expanded name
        if (resident) {
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

    public String getName()
    {
        return (name);
    } //gets name, used in calcinf
    public void setName(String inputName)
    {
        name = inputName;
    } // sets name, takes input and assigns to var

    public double getGross(){ return (grossSalary);} // gets gross income, used in calcinf
    public void setGross(double inputGross){grossSalary = inputGross;}  // sets gross, takes input from calcinf

    public boolean getResident(){ return (resident);}
    public void setResident(boolean inputResident){resident = inputResident;}

    
}
