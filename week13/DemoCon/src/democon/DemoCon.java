
package democon;
public class DemoCon {
    public static void main(String[] args) {
        
        Manager One=new Manager();
        Manager Two=new Manager(200);
        One.setnumber(100);
     
        System.out.println(+One.getnumber());
        System.out.println(+Two.getnumber());
        System.out.println(+Two.getWage());
        
        Manager three=new Manager(600.5);
        System.out.println(+three.getWage());
        
        Manager four=new Manager(400,700.5);
        System.out.println(+four.getWage());
        System.out.println(+four.getnumber());
        
        
        
        
    }
    
}
