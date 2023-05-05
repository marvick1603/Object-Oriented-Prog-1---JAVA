
package demowhile;
import java.util.Scanner;

public class DemoWhile {

   
    public static void main(String[] args) {
       
        int count=0;
        while(count<5)
        {
            System.out.print(count+"\t");
            count++;
        }
        
        System.out.println();
        count=2;
        while(count<7)
        {
            System.out.print(count+"\t");
            count++;
        }
        
         System.out.println();
         
         
        count=2;
        while(count<11)
        {
           if(count<5 ||count>7)
               System.out.print(count+"\t");
            count++;
        }
        
        Scanner k= new Scanner(System.in);
        System.out.println("Enter a No between 0 and 100");
        int num=k.nextInt();
        while(num<0 || num>100)
        {
            System.out.println("Invalid, enter no between 0 and 100 ");
            num=k.nextInt();
        }
        
        
    }
    
}
