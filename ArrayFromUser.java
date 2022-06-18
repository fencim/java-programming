import java.util.Scanner;
import java.util.ArrayList;
public class ArrayFromUser {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many scores do you want to enter");
        int scoreCount = userInput.nextInt();

        System.out.println("You need to enter "+ scoreCount + " scores");

        
        userInput.close();
    }
}
