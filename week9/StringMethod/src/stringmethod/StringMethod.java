
package stringmethod;
import java.util.Scanner;
public class StringMethod {

    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
       System.out.println("Enter a String");
        String s1=k.nextLine();
     
        
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        String s2=s1.toUpperCase();
        System.out.println(s2);
           if(s1.length()>2)
        System.out.println("first three character:"+s1.substring(0,3));
           System.out.print(s1.substring(2));
        
       
        
        

        
    }
    
}
