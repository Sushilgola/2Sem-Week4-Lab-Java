import java.util.Scanner;

public class TestOddAndEven1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        odd_and_Even1 obj = new odd_and_Even1();
        System.out.println("How many Number you Want to Enter: ");
        int n = sc.nextInt();

        System.out.println("Enter "+ n+ " Numbers");
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            obj.count_num(num);
        }
        obj.Display();
    }
}
