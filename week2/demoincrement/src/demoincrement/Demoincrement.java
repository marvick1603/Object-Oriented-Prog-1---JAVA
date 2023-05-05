
package demoincrement;

public class Demoincrement {

    public static void main(String[] args) {
       int x=1;
       int y=x++;
       System.out.println("y="+y);
       System.out.println("x="+x);
       
       int a=1;
       int b=++a;
       System.out.println("a="+a);
       System.out.println("b="+b);
       
       int d=4;
       int e=--d;
       System.out.println("d="+d);
       System.out.println("e="+e);
       
       int f=5;
       System.out.println("f++="+f++);
       System.out.println("f="+f);
       
       int g=3;
       int h=4;
      // g*=h;
       System.out.println("g="+g);
       System.out.println("h="+h);
       System.out.println("g=g*h="+(g*=h));
       
       
       
       
       
       
    }
    
}
