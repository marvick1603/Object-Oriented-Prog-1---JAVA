
package democompare;
import java.util.Scanner;

public class Democompare {
    
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("ENTER first INTEGER:");
        int x=k.nextInt();
        System.out.println("X="+x);
        System.out.print("ENTER second INTEGER:");
        int y=k.nextInt();
        System.out.println("Y="+y);
        boolean isequal;
        isequal=(x==y);
        System.out.println("they are same numbers."+isequal);
        
         boolean isgreater;
        isgreater=(x>y);
        System.out.println("X>Y."+isgreater);
        
        boolean istrue=true;
        boolean isfalse=false;
        boolean isAnd=istrue && isfalse;
        System.out.println("ANSWER OF LOGICAL(1) OPERATORS:"+isAnd);
        
         boolean isOr=(x>y)||(x<y);
        System.out.println("ANSWER OF LOGICAL(2) OPERATORS:"+isOr);
        
        boolean isNot=(!isOr);
        System.out.print(isNot);
        
        
    }
    
}
