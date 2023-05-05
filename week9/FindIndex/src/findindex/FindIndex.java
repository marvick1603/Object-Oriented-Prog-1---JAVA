
package findindex;
import java.util.Scanner;
public class FindIndex {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the String");
        String word=k.nextLine();
        System.out.println("enter a letter");
        String letter=k.nextLine();
        
        while(letter.length()>1)
                {
                    System.out.print("Type in single letter");
                    letter=k.nextLine();
                    
                }
        int index=word.indexOf(word);
        System.out.println("index is"+index);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else
            System.out.println("is at index"+index);
        
    }
    
}
