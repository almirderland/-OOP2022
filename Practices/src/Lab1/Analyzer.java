package Lab1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Data d = new Data();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number (Q to quit): ");
            if (sc.hasNextInt()) {
                d.add(sc.nextInt());
            } else if (sc.hasNext("Q")) {
                System.out.println("Average = " + d.getAvg());
                System.out.println("Maximum = " + d.getMax());
                break;
            }
        }
    }
}