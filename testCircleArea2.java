import java.util.*;
public class testCircleArea2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle: ");
        double rd = sc.nextDouble();
        System.out.println("Enter the Center Points of Circle: ");
        int h = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Enter the Points of Circle: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        circleArea2 obj = new circleArea2(h, k, x, y,rd);

        obj.calculateArea();
        obj.calculateParameter();

        obj.display();
    }
    
}
