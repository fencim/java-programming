import java.util.Scanner;
import java.util.ArrayList;
public class SortingArray {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the scores");
        while (userInput.hasNextInt()) {
            int score = userInput.nextInt();
            scores.add(score);
        }
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score at "+ (i + 1) + " is " + scores.get(i));
        }
        
        userInput.close();
    }
    
}
