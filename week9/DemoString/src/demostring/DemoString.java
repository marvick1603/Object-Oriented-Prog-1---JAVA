
package demostring;
import java.util.Scanner;
public class DemoString {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter first String:");
        String s1=k.nextLine();
        System.out.println("Enter Second String:");
        String s2=k.nextLine();
     /*   if(s1.equals(s2))
        {
          System.out.println(s1);
        }
        else
        {
        }  */
     if(s1.equals(s2))
        System.out.println("Same Exact Characters");
    /* else if(s1.equalsIgnoreCase(s2))
         System.out.println("Same Letter");*/
    if(s1.equalsIgnoreCase(s2))
         System.out.println("Same Letter");
    
   /* for(int i=0;i<s1.length();i++)
    {
       System.out.println(s1.charAt(i));
    }
*/
     for(int sub=0;sub<s1.length();sub++)
        System.out.println(s1.charAt(sub));
     
     char letter[]=new char[s2.length()];
     /*
     for(int sub=0;sub<s2.length();sub++)
       letter[sub]=s2.charAt(sub); // for char use only lenght but for string use lenght()
     */
     for(int sub=0;sub<letter.length;sub++)
       letter[sub]=s2.charAt(sub);
         
      System.out.println(letter[0]);
        
    }
    
}
