
package demoparameter;

public class DemoParameter {

public static void main(String[] args) {
     TheParameter one= new TheParameter(); 
     System.out.println("Ones number is: "+one.getnumber());
     
     one.process(1);
     System.out.println("Ones number is: "+one.getnumber());
     
     one.change(10);
     System.out.println("Ones number is: "+one.getnumber());
     
     one.testmethod(5);
     System.out.println("Ones number is: "+one.getnumber());
    }
}
