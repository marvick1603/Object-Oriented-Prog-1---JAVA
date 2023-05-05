
package demoarithemetic;


public class Demoarithemetic {

    public static void main(String[] args) {
       int iModulus=22%5;
       System.out.println(iModulus);
       
       int iDivide=22/5;
       System.out.println(iDivide);
        
        double dDivide=22/5;
        System.out.println(dDivide);
        
        double dDivision=22/5.0;
        System.out.println(dDivision);
        
        //int iDivision=22/5.0;
        
        int sum=5+5/5;
        System.out.println("sum " +sum);
        
        int total=(5+5)/5;
        System.out.println("total "+total);
        
        
        /*
        as today firday we will consider it as 5.
        and add it to it to determine the day of the week and find the remainders of addition and 7
        */
        int day=5;
        int totalnoofdays=225;
        int r_day=(day+totalnoofdays)%7;
        System.out.println("it will be day: "+r_day);
        
        int minutes=487;
        int hour=minutes/60;
        int remainingminutes=minutes%60;
        System.out.println("hours "+hour+" minutes "+remainingminutes);
        
        
       
    }
    
}
