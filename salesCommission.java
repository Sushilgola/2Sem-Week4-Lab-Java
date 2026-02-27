import java.util.*;

public class salesCommission {
    public static Double calculateCommission(double p){ 

        double com = 0;
        if(p < 0){
            System.out.println("Invalid Input");
        }
        else if(p < 0){
            com = p * 2 / 100;
        }
        else if(p > 500 && p <= 5000){
            com = p * 5 / 100;
        }
        else if(p > 5000){
            com = p * 8 /100;
        }
        return com;
    }
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Prize: ");
        double price = sc.nextDouble();
        double commission  = 0;

        
        // System.out.println(commission);
        commission = calculateCommission(price);
        System.out.println(commission);
    }
}
