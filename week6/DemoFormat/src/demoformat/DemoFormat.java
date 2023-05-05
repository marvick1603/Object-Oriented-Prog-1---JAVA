
package demoformat;

public class DemoFormat {

    public static void main(String[] args) {
        
        int i=22;
        System.out.printf("The Number %d is displayed",i);
        System.out.println();
        System.out.println("The number"+i+"is displayed");
        System.out.printf("The number %8d is displayed\n",i);
        
        double digit=35.5;
        System.out.printf("The price is %f is displayed\n",digit);
        System.out.printf("The price %.2f is displayed\n",digit);
        
        String name="Fred";
        System.out.printf("Welcome %s to Toronto\n", name);
        System.out.printf("Welcome %10s to Toronto\n",name);
        
        System.out.printf("%s, for %d books,the price is $%.2f\n", name,i,digit);
        
        
    }
    
}
