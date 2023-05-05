
package readstring;
import java.util.Scanner;

public class ReadString {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
       String s1;
       System.out.println("Enter String s1:");
       s1=k.nextLine();
       System.out.println("s1 is:"+s1);
       System.out.println("Enter another string:");
       String s2=k.next();
       System.out.println("s2 is:"+s2);
       String s3=k.next();
       System.out.println("s3:"+s3);
       
       
    }
    
}
