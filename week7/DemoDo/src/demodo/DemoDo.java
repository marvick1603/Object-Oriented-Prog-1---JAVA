package demodo;

import java.util.Scanner;

public class DemoDo {

    public static void main(String[] args) {
        int num = 0;

        do {
            System.out.print(num + "\t");
            num++;
        } while (num < 5);

        num = 4;
        do {
            // if ((num >= 4 && num <= 6) || (num >= 10 && num <= 12)) 
            if (num < 7 || num > 9) {
                System.out.print(num + "\t");
            }

            num++;
        } while (num < 13);

        System.out.println();

        num = 14;
        do {
            if ((num >= 12) || (num <= 5)) {
                System.out.print(num + "\t");
            }
            num--;
        } while (num > 2);

        System.out.println();
        Scanner k = new Scanner(System.in);

        int total = 0;
        int no = 0;

        do {

            System.out.println("Enter a no to add or to end type -1");
            no = k.nextInt();
            if (no > 0) {
                total = total + no;
                System.out.println("total is" + total);
            } else {

                System.out.println("Enter Only positive int");
            }

        } while (no > 0);
        System.out.println("final total is:"+total);

    }

}
