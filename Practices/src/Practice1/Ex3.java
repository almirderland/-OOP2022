package Practice1;

import java.util.Scanner;

public class Ex3 {
	  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    int num = in.nextInt();
		    mark(num);
		  }
	  
	  static void mark(int a) {
		  if (95 <= a && a <= 100) {
		    System.out.println("A");
		  } 
		  else if (90 <= a && a <= 94) {
			  System.out.println("- A");
		  }
		  else if (85 <= a && a <= 89) {
			  System.out.println("+ B");
		  }
		  else if (80 <= a && a <= 84) {
			  System.out.println("B");
		  }
		  else if (75 <= a && a <= 79) {
			  System.out.println("- B");
		  }
		  else if (70 <= a && a <= 74) {
			  System.out.println("+ C");
		  }
		  else if (65 <= a && a <= 69) {
			  System.out.println("C");
		  }
		  else if (60 <= a && a <= 64) {
			  System.out.println("- C");
		  }
		  else if (55 <= a && a <= 59) {
			  System.out.println("+ D");
		  }
		  else if (50 <= a && a <= 54) {
			  System.out.println("D");
		  }
		  else if (50 > a ) {
			  System.out.println("F");
		  }
		  else {
			  System.out.println("Error");
		  }
	  }
}
