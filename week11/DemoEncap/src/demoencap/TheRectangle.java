
package demoencap;

public class TheRectangle {
    public int width=0;
    public int length=0;
    public int area=0;
    
    public void setwidth(int w){
        width=w;
    }
    
    public void setlength(int l){
        length=l;
    }
    
    public void  calculateArea(){
       area=width*length;
    }
    
    public int getarea(){
        calculateArea();
        return area;
    }
    
}
