package calculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		char operator;
	    Double val1, val2, result;

	    
	    Scanner input = new Scanner(System.in);

	    System.out.println("Select an operator: +, -, *, /");
	    operator = input.next().charAt(0);

	   
	    System.out.println("Enter first number");
	    val1 = input.nextDouble();

	    System.out.println("Enter second number");
	    val2 = input.nextDouble();

	    switch (operator) {

	      
	      case '+':
	        result = val1 + val2;
	        System.out.println("Result = "+result);
	        break;

	      
	      case '-':
	        result = val1 - val2;
	        System.out.println("Result = "+result);
	        break;

	     
	      case '*':
	        result = val1 * val2;
	        System.out.println("Result = "+result);
	        break;

	     
	      case '/':
	        result = val1 / val2;
	        System.out.println("Result = "+result);
	        break;

	      default:
	        System.out.println("Wrong Operator Selected!");
	        break;
	    }

	    input.close();
		

	}

}
