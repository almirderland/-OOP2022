package Practice1;

import java.lang.Math;
import java.util.Scanner;

public class Ex4 {
	  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = in.nextInt();
		    discriminant(a,b,c);
		  }
	  static void discriminant(int a, int b, int c) {
		  double d = b*b - 4 * a * c;
	  
		  if (d > 0) {
			  double x1 = (-b + Math.sqrt(d))/2*a;
			  double x2 = (-b - Math.sqrt(d))/2*a;
			  System.out.println(x1 + " " + x2);
		  } 
		  else if (d == 0) {
			  double x1 = (-b - Math.sqrt(d))/2*a;
			  System.out.println(x1);
		  }
		  else {
			  System.out.println("Error");
		  }

	  }
}
