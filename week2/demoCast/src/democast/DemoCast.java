package democast;
public class DemoCast {
public static void main(String[] args) {
        int num1=10,num2=20;
        double total=num1+num2;
        System.out.print("TOTAL="+total);
        
        double digit1=1.1,digit2=1.2;
        //int sum=digit1+digit2;
       //System.out.print("sum="+sum);
      int sum=(int)digit1+(int)digit2;
       System.out.println("sum="+sum);
       int iDivide=num1/num2;
       System.out.println("iDivide="+iDivide);
       
       double dDivide=num1/num2;
        System.out.println("dDivide="+dDivide);
       // double cDivide=(double)(num1/num2);
      // double cDivide=(double)num1/num2;
        double cDivide=(double)num1/(double)num2;
        System.out.println("cDivide="+cDivide);
        
        
    }
    
}
