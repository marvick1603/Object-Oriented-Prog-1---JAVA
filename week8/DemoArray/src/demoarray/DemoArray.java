
package demoarray;

public class DemoArray {

    public static void main(String[] args) {
       int numbers[]={5,13,9,44};
       System.out.println("First element of array is: "+numbers[0]);
       System.out.println("length of array is="+numbers.length);
       System.out.println("Last element of array is: "+numbers[numbers.length-1]);
       
       for(int sub=0;sub<numbers.length;sub++)
       {
           System.out.println("Number["+sub+"] is: "+numbers[sub]);
       }
       
       int i=0;
       while(i<numbers.length)
       {
           System.out.print("Number["+i+"] is: "+numbers[i]+" ,");
           i++;
           
       }
    }
    
}
