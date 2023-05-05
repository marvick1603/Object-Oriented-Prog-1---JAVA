package demomulti;

public class DemoMulti {

    public static void main(String[] args) {
        TheParam one = new TheParam();
        System.out.println("ones number:" + one.getnumber());
        System.out.println("one digit:" + one.getdigit());
        
        one.setdigit(22.4);
        System.out.println("ones digit:" + one.getdigit());
        
        //one.process(2.2, 3);
        one.process(30,30);
        //one.process(3.3, 4.4);
        
        one.stuff(1,1.1, 2);
        System.out.println("ones number:" + one.getnumber());
        System.out.println("one digit:" + one.getdigit());
        

    }

}
