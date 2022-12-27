package Practice1;

import java.lang.Math;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    area(a);
	    perimeter(a);
	    diagonal(a);
	  }
	  
	  static void area(int a) {
	    System.out.println(a*a);
	  }
	  static void perimeter(int a) {
		    System.out.println(4*a);
		  }
	  static void diagonal(int a) {
		  double d = a * Math.sqrt(2);
		    System.out.println(d);
		  }
}
