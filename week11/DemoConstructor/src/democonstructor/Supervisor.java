
package democonstructor;

public class Supervisor {
    
    public Supervisor(int n){
        number=n;
    }
    
    //add default constructor
    public Supervisor(){
        number=200;
    }
    
    private int number=100;
    
    public int getnumber(){
        return number;
    }
    
   public void setnumber(int n){
       number=n;
   }
}
