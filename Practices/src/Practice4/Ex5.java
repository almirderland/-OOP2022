package Practice4;

import java.util.*;

public class Ex5{
    public static void main(String[] args)
    {
       double                 leftOperand = 0, result = 0, rightOperand = 0;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer1;
       StringTokenizer        tokenizer2;
       Scanner in = new Scanner(System.in);
       

       tokenizer1 = new StringTokenizer(in.nextLine(), " ", false);
       
       while (tokenizer1.hasMoreElements()) {
           tokenizer2 = new StringTokenizer(tokenizer1.nextToken(), "+-/*", true);    	   
    	   try{
	          leftString   = tokenizer2.nextToken();
	          operator     = tokenizer2.nextToken();
	          rightString  = tokenizer2.nextToken();
	
	          try {
	        	  leftOperand  = Double.parseDouble(leftString);
	          }
	          catch(NumberFormatException e) {
	        	  System.out.println("Left not double");
	          }
	          try {
	        	  rightOperand = Double.parseDouble(rightString);
	          }
	          catch(NumberFormatException ee) {
	        	  System.out.println("Right not double");
	          }
	          if (operator.equals("+"))
	             result = leftOperand + rightOperand;
	          if (operator.equals("*"))
	             result = leftOperand * rightOperand;
	          if (operator.equals("-"))
		             result = leftOperand - rightOperand;
	          if (operator.equals("/")) {
	        	  try {
	        		  result = leftOperand / rightOperand;
	        	  }
		          catch (ArithmeticException eee) {
		      		System.out.println("Division by 0");		
		          }
	          }

	          System.out.println("Result: " + result);
    	   }
	       catch (NoSuchElementException nsee)
	       {
	          System.out.println("Invalid syntax");
	       }
	       catch (NumberFormatException nfe)
	       {
	          System.out.println("One or more operands is not a number");
	       }


       }
    }
}
