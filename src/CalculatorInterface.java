// You can add extra methods if you think it is necessary

import java.util.*;


public class CalculatorInterface
{
    public void run()
    {
        Scanner console = new Scanner (System.in);
	Client client;
        
	client = new Client();
        System.out.print("Name: ");
        String name = console.next();
        client.setName(name);

        System.out.print("Gross income: ");
        double gross = console.nextDouble();
        client.setGross(gross);
        System.out.println(client.getGross());

        System.out.print("Resident: (Enter true or false)");
        boolean resident = Boolean.parseBoolean(console.next());
        client.setResident(resident);
        System.out.println(client.getResident());
        System.out.println(client.calcTax());

     }
    
  
    public static void main(String[] args)
    {
        CalculatorInterface calc = new CalculatorInterface();
        calc.run();
    }
}
        
    

    
    
    
    
    
    
    


        

	