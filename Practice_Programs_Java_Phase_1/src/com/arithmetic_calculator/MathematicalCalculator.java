package com.arithmetic_calculator;
import java.util.Scanner;

public class MathematicalCalculator {
	

	public static void main(String[] args) 
	{
		int select;
		String st;
		double num1,num2,result;
		Scanner calc= new Scanner(System.in);
		System.out.println("***********************************");
		System.out.println("\tCALCULATOR\t");
		System.out.println("***********************************\n");
		
		do
		{
			
			System.out.println("Main Menu:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n\n\n ");	
			System.out.println("Select your Choice: \n ");
			select = calc.nextInt();
			
			switch (select)
			{
			case 1 : System.out.println("Enter your number:\n");
			           num1=calc.nextDouble();
			           num2=calc.nextDouble();
			           result=num1+num2;
			           System.out.println("Result is:"+ result);
			           break;
			case 2 : System.out.println("Enter your number:\n");
	                   num1=calc.nextDouble();
	                   num2=calc.nextDouble();
	                   result=num1-num2;
	                   System.out.println("Result is:"+ result);
	                   break;
			case 3 : System.out.println("Enter your number:\n");
	                   num1=calc.nextDouble();
	                   num2=calc.nextDouble();
	                   result=num1*num2;
	                   System.out.println("Result is:"+ result);
	                   break;
			case 4 : System.out.println("Enter your number:\n");
	                   num1=calc.nextFloat();
	                   num2=calc.nextFloat();
	                   result=num1/num2;
	                   System.out.println("Result is:"+ result);
	                   break;
			case 5 : 
				       System.exit(0);
                       break;
            default  : System.out.println("Wrong Choice  !!!!!\n");
                       break;
			}
		
			System.out.println("\nDo you want to continue(Yes/No):");
			st = calc.next();
		}while(st.charAt(0)=='y' || st.charAt(0)=='Y');
		
		
	
	}
}
