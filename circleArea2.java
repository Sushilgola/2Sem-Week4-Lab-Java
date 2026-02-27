import java.util.*;
public class circleArea2 {
    Scanner sc = new Scanner(System.in);
    double rd;
    double h;
    double k;
    int x;
    int y;

    public circleArea2(double h, double k, int x, int y,double rd){
        this.h = h;
        this.k = k;
        this.x = x;
        this.y = y;
        this.rd = rd;

    }
    
    int flag = 1;
    double area_circle = 0;
    double parameter_circle = 0;

    void calculateArea(){
        area_circle = Math.PI*(rd*rd);
    }
    void calculateParameter(){
        parameter_circle = 2*Math.PI*rd;
    }

    void circle_cordinate(){
        // double a = (x-h);
        // double b = y-k;
        double pointsLies;
        pointsLies = ((x-h)*(x-h) + (y-k)*(y-k));
        if(pointsLies < Math.sqrt(rd)){    
            flag = 1;
        }
        else if(pointsLies == Math.sqrt(rd)){
            flag = 2;
        }
        else{   
            flag = 0;
        }
    }
    void display(){
        System.out.println("Area Of Circle: "+ area_circle);
        System.out.println("Parameter Of Circle: "+ parameter_circle);
        // System.out.println("a"+ a);
        if (flag==1){
            System.out.println("Point("+ x + ","+ y+ ") Lies inside the Circle");
        }
        else if(flag==2){
            System.out.println("Point("+ x + ","+ y+ ") Lies On the Circle");
        }
        else{
            System.out.println("Point("+ x + ","+ y+ ") Lies Outside the Circle");
        }
    }

}
