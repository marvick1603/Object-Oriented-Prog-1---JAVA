
package demothis;
import java.util.Scanner;
public class DemoThis {
    
    
    public static void main(String[] args) {
        
        Scanner k=new Scanner(System.in);
        TheShape one=new TheShape(100);
        System.out.println("Number:-"+one.getnumber());
        System.out.println("Enter the width");
        int w=k.nextInt();
        one.setwidth(w);
        System.out.println("Enter the heigth");
        int h=k.nextInt();
        one.setwidth(h);
        System.out.println(+one.getperimeter());
        System.out.println("square?="+one.isSqaure());
    
    }
    
}
