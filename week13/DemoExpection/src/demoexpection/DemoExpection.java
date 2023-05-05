package demoexpection;

import java.util.Scanner;

public class DemoExpection {

    public static void main(String[] args) {

        try {
            Scanner k = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = k.nextInt();
            System.out.println("Number is: " + number);
        } catch (Exception e) {
            System.out.println("Must Enter Integer!!");
        }finally{
            System.out.println("Program Block has ended");
        }

    }
}
