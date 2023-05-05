
package demoif;
import java.util.Scanner;

public class Demoif {

   
    public static void main(String[] args) {
        System.out.println("ENTER INTEGRER:");
        Scanner k= new Scanner(System.in);
        int x=k.nextInt();
        //System.out.println("ENTER INTEGRER:"+x);
        if(x<22)
        {
            System.out.println("Number is less than 22");
        }
        if(x==55)
        {
            System.out.println("Number is 55");
            System.out.println("Number has two fives");
        }
        if(x%2==0)
        {
            System.out.println(" Number is EVEN");
            
        }
        else
        {
             System.out.println("Number is ODD");
        }
        if(x>100)
        {
            System.out.println("Number is greater than 100");
            
        }
        else
        {
             System.out.println("Number is less than 100");
              System.out.println(" Or Number is 100");
        }

        
      
    }
    
}
