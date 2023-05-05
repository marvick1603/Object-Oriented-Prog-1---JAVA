
package demothrow;
import java.util.Scanner;
import java.util.InputMismatchException;
public class DemoThrow {
    public static void main(String[] args) {
        
        try{Scanner k=new Scanner(System.in);
        System.out.println("Enter a Integer");
        int num=k.nextInt();
        if(num<0){
            throw new Exception("Enter positive number");}
        else if(num>100)
        {
            throw new Exception("Greater than 100");
        }
        }catch(Exception e)
          {
             System.out.println(e.getMessage());   
         
          }catch(InputMismatchException e)
          {
              System.out.println("Ji"
                      + "");
          }
              
              
       
            
        
        
    }
    
}
