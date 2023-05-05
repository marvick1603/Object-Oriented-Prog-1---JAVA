
package demoover;

public class TheOver {
    private int number=10;
    private double digit=1.1;
    public int getnumber()
    {
        return this.number;
    }
    public double getdigit()
    {
        return this.digit;
    }
    
    public void process()
    {
        this.number=this.number+10;
        this.digit=this.digit+1;
    }
    
    public void process(int num)
    {
        this.number=this.number+num;
    }
    
    public void process(double digit)
    {
        this.digit=this.digit+digit;
    }
    
    public void process(int num , double digit)
    {
        this.number=this.number+num;
        this.digit=this.digit+digit;
    }
    
    public void process(double d, int num)
    {
        this.digit=this.digit+digit;
         this.number=this.number+num;
    }
            
}
