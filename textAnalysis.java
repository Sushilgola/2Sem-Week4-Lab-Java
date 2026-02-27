import java.util.*;

public class textAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sentence = 0;
        int word = 1;
        int noE = 0;
        int noZ = 0;

        System.out.println("Enter the Sentance: ");
        String text = sc.nextLine();

        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
           if(ch == ' '){
            word++;
           } 
           else if(ch == '.'){
            sentence++;
           }
           else if(ch == 'e'){
            noE++;
           }
           else if(ch == 'z'){
            noZ++;
           }
        }
        
        System.out.println("word: "+ word+ "\nSentence: "+ sentence+ "\nNumber of E: "+noE+ "\nNumber of z: "+noZ);

    }
}
