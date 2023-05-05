
package demomultiple;
import java.util.Scanner;
import java.util.InputMismatchException;
public class DemoMultiple {
    public static void main(String[] args) {
        try{
        Scanner k=new Scanner(System.in);
        System.out.println("Enter integer 1:");
        int num1=k.nextInt();
        System.out.println("Enter integer 2: ");
        int num2=k.nextInt();
        System.out.println("Num1/Num2: "+num1/num2);
        }catch(ArithmeticException e)
        {
            System.out.println("The second integer can not be zero");
        }
        catch(InputMismatchException e){
         System.out.println("Must Integer Value");
       }
        catch(Exception e)
        {
            System.out.println("e.getMessage()is"+e.getMessage());
            System.out.println("e is"+e);
        }
        
        
        
    }
    
}
