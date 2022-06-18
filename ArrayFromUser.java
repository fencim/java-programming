import java.util.Scanner;
import java.util.ArrayList;
public class ArrayFromUser {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many scores do you want to enter");
        int scoreCount = userInput.nextInt();

        System.out.println("You need to enter "+ scoreCount + " scores");
        int counter = 0;
        while (counter < scoreCount) {
            //ask ng input
            int score = userInput.nextInt();
            scores.add(score);
            counter++;
        }

        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score at " + i + " is " + scores.get(i));
        }
        userInput.close();
    }
}
