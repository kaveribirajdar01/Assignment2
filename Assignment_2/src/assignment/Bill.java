package assignment;
import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Bill Unit");
		int i=sc.nextInt();
 
        System.out.println(
            calculateBill(i));
	}		    
			    public static int calculateBill(int units)
			    {
			 
			       
			        if (units >= 1 && units <= 100) {
			            return units * 10;
			        }
			        else if (units > 100 && units <= 200) {
			            return units * 15;
			        }
			        else if (units > 200 && units <= 300) {
			            return units * 20;
			        }
			        else if (units > 300) {
			            return units * 25;
			        }
			        return 0;
			    }
	}


