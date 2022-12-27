package Practice1;
import java.util.Scanner;

public class Ex1 {
	
	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String name = in.next();
	    drawBox(name);
	  }
	  
	  static void drawBox(String name) {
	    int lenName = name.length();
	    System.out.println("+" + "-".repeat(lenName)+ "+");
	    System.out.println("|" + name + "|");
	    System.out.println("+" + "-".repeat(lenName) + "+");
	  }
	  
	}

