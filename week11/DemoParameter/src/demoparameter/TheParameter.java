
package demoparameter;
public class TheParameter {
    private int number=5;
    
    public int getnumber(){
        return number;
    }
    
    public void process(int num){
      //  number=number+num;
      number+=num;
    }
    
    private void stuff(int num){
        number+=num;
    }
    
    public void change(int num){
        num++;
        stuff(num);
    }
    
    public int testmethod(int num){
        number=number+num;
        return number;
    }

}
