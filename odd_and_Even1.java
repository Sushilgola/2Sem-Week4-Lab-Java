import java.util.*;
public class odd_and_Even1{
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        void count_num(int num){
                if(num%2 ==0){
                        even++;
                }
                else{
                        odd++;
                }
        }
        void Display(){
                System.out.println("Even Number: "+ even);
                System.out.println("Odd Number: "+ odd);
        }
}
