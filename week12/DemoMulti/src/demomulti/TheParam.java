package demomulti;

public class TheParam {

    private int number = 10;
    private double digit = 10;

    public int getnumber() {
        return this.number;
    }

    public double getdigit() {
        return this.digit;
    }

    public void setdigit(double digit) {
        this.digit = digit;
    }

    public void process(int number, double digit) {
        this.number = number;
        this.digit = digit;
    }
    
    public void stuff(int num, double d , int change){
        this.number=num+change;
        this.digit=d+change;
    }
}
