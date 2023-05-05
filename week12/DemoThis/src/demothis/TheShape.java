
package demothis;

public class TheShape {
    
    private int number,width,height,parimeter;
    
    public int getnumber()
    {
        return number;
    }
    
    public TheShape(int number )
    {
        this.number=number;
    }
 
    public void setwidth(int width)
    {
        this.width=width;
    }
    
    public void setheight(int heigth)
    {
        this.height=heigth;
    }
    
    public int getperimeter()
    {
        
        return this.parimeter;
    }
    
    private void calculatePerimeter()
    {
        this.parimeter=2*(this.width+this.height);
    }
    
    public boolean isSqaure()
    {
        if(this.height==this.width)
        {
            return true;
        }
        else
            return false;
    }
}
