import java.util.Scanner;
public class ArrayFromUser {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many scores do you want to enter");
        int scoreCount = userInput.nextInt();

        System.out.println("You need to enter "+ scoreCount + " scores");

        userInput.close();
    }
}
