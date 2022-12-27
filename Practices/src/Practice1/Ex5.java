package Practice1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    double initialBalance = in.nextDouble();
	    double interest = in.nextDouble();

	    newBalance(initialBalance,interest);
	  }
  static void newBalance(double a, double b) {
	  	System.out.println(a * b / 100 + a);
	  }

}
