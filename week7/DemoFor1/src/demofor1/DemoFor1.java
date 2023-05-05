
package demofor1;
public class DemoFor1 {

    public static void main(String[] args) {
       
         for(int i=0;i<6;i++)
             System.out.print(i+"\t");
        
        
          System.out.println();
        
         for(int i=1;i<6;i++)
             System.out.print(i+"\t");
         
         System.out.println();
            
         
         for(int i=4;i>0;i--)
              System.out.print(i+"\t");
         
          System.out.println();
         
         for(int i=0;i<5;i++)
         {
             if(i!=2)
             {
                 System.out.print(i+"\t");
             }
         }
         
          System.out.println();
          
          for(int i=1;i<10;i++)
         {
             if(i<3 || i>6)//if(i==1 || i==2 || i==7 || i==8 || i==9)
             {
                 System.out.print(i+"\t");
             }
         }
      
          
        
        
    }
    
}
