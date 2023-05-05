
package demomulti;
import java.util.Scanner;

public class DemoMulti {


    public static void main(String[] args) {
       
       System.out.println("Enter a number:");
       Scanner k=new Scanner(System.in);
       double digit=k.nextDouble();
       if(digit<0)
       {
           System.out.println("Negative Number"+digit);
       }
       if(digit>=0 && digit<100)
       {
           System.out.println("Number is positive");
           System.out.println("Number is less than 100");
       }
       if(digit<0)
               {
                  System.out.println("Negative number:"+digit);
               }
       else if(digit>=0 && digit<100)
       {
         /** System.out.println("Positive Number"+digit);
           if(digit<100)
           {
               System.out.println("Number is less then 100"+digit);
           }
           * */
           System.out.println("Positive Number"+digit);
            System.out.println("Number is less then 100"+digit);
            
       }
       else if(digit>=100)
       {
           System.out.println("Number is greater than or equal to 100");
       }
       
    }
    
}
