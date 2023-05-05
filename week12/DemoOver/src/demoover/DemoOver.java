
package demoover;

public class DemoOver {

    public static void main(String[] args) {
       TheOver one= new TheOver();
        System.out.println("one number:"+one.getnumber());
        System.out.println("one digit:"+one.getdigit());
        
        one.process();
        System.out.println("one number:"+one.getnumber());
        System.out.println("one digit:"+one.getdigit());
        
        one.process(10);
         System.out.println("one number:"+one.getnumber());
         
        one.process(2.0);
        System.out.println("one digit:"+one.getdigit());
        
        one.process(22, 42.9);
        System.out.println("one number:"+one.getnumber());
        System.out.println("one digit:"+one.getdigit());
        
      //  one.process(10, 10);
        one.process(10.1, 10);
        System.out.println("one number:"+one.getnumber());
        System.out.println("one digit:"+one.getdigit());
        
    }
    
}
