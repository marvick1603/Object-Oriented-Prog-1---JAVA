
package democlass;

public class DemoClass {

    public static void main(String[] args) {
       Employee one=new Employee();
       System.out.println(one.number);
       
         Employee two=new Employee();
       System.out.println(two.number);
       
       one.number=11;
        System.out.println(one.number);
         System.out.println(two.number);
         
         System.out.println(one);
           System.out.println(two);
         
        
    }
    
}
