
package democon;
public class Manager {
    private int number=100;
    private double wage=500;
    
    public void setnumber(int number)
    {
        this.number=number;
    }
    public int getnumber()
    {
        
        return number;
    }
    public Manager ()
    {
        
    }
    public Manager(int number)
    {
       this.number=number;
    }


    public double getWage() {
        
        return wage;
        
    }
    public Manager(double wage){
        this.wage=wage;
    }

    
    public void setWage() {
        this.wage = 500;
    }
    
    public Manager(int number, double wage){
        this.number=number;
        this.wage=wage;
    }
    
    
}
