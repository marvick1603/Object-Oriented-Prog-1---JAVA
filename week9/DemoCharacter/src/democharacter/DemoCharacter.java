
package democharacter;

public class DemoCharacter {

    public static void main(String[] args) {
       char letter='a';
       int number= letter;
       System.out.println("Letters no is "+number);
       letter++;
       number= letter;
        System.out.println("Letters no is "+number+" and the letter is "+letter);
        number= 'c';
         System.out.println("Letters no is "+number);
         number=100;
         letter=(char)number;
        System.out.println("Letter is "+letter);
        if(letter>='a' && letter <='z')
        {
            System.out.println("Lowercase Character");
        }
       System.out.println(Character.toUpperCase(letter));
        
    }
    
}
