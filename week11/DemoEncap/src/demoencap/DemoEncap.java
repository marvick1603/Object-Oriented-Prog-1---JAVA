
package demoencap;
import java.util.Scanner;
public class DemoEncap {

public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
    TheRectangle one= new TheRectangle();
    
    System.out.println("Enter the width:");
    one.setwidth(k.nextInt());
    System.out.println("width is: "+one.width);
    
     System.out.println("Enter the length:");
     one.setlength(k.nextInt());
     System.out.println("length is: "+one.length);
     
    System.out.println("Area is: "+one.getarea());
    
    
    
   
   

    }
}
