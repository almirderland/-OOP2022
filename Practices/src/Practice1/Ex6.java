package Practice1;

import java.util.Scanner;

public class Ex6 {
	  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    String name = in.next();
		    checkPalindrome(name);
		  }
	  static void checkPalindrome( String str) {
		  int len = str.length();
		  String newName = "";
		  for (int i = 0; i<len; i++) {
			  newName = str.charAt(i) + newName;
		  }
		  if (newName.equals(str)){
			  System.out.println(true);
		  }
		  else {
			  System.out.println(false);
		  }
	  }
}
