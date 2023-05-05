
package coinflip;
import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args) {
        
        Scanner k=new Scanner(System.in);
       
        double d1=Math.random();
        //  System.out.println(d1);               
        if(d1>0.5)
        {
           System.out.println("Heads");
        }
        else
        {
            System.out.println("Tails");
        }
        
        System.out.println("Enter how many times you want to flip coin?");
        int flips=k.nextInt();
        System.out.println("No of time coin fliped:"+flips);
       /* for(int i=0;i<flips;i++)
        {
            
            d1=Math.random();
        //  System.out.println(d1);               
        if(d1>0.5)
        {
           System.out.println("Heads");
        }
        else
        {
            System.out.println("Tails");
        }
            
        }*/
       int counts=0;
       int heads=0;
       int tails=0;
       while(counts<flips)
       {
          // double d2=Math.random();
           
           if(Math.random()>0.5)
           {
               //System.out.print("heads \t");
               heads++;
           }
           else
           {
               //System.out.print("tails \t");
               tails++;
           }
           counts++;
                       
       }
       System.out.println("no of heads: "+heads);
       System.out.println("no of tails: "+tails);
       
       int dice=(int)(Math.random()*6+1);
        // System.out.println(dice);
        switch (dice) {
            case 1:
                System.out.println(dice);
                break;
            case 2:
                System.out.println(dice);
                break;
            case 3:
                System.out.println(dice);
                break;
            case 4:
                System.out.println(dice);
                break;
            case 5:
                System.out.println(dice);
                break;
            default:
                System.out.println(dice);
                break;
        }
       
            
        
    }
    
}
