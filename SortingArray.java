import java.util.Scanner;
import java.util.ArrayList;
public class SortingArray {
    static ArrayList<Integer> scores = new ArrayList<Integer>();
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the scores");
        while (userInput.hasNextInt()) {
            int score = userInput.nextInt();
            scores.add(score);
        }
        printItems();
        System.out.println("NOw sorting with bubble sort");
        bubbleSort();
        printItems();
        
        userInput.close();
    }
    static void bubbleSort() {
        for (int pass = 1; pass <= scores.size() - 1; pass++) {
            for (int i = 0; i < scores.size() - 1; i++) {
                if (scores.get(i) < scores.get(i + 1)) {
                    //swapping
                    int temp = scores.get(i);
                    scores.set(i, scores.get(i + 1));
                    scores.set(i + 1, temp);
                }
            }
        }
    }
    static void printItems() {
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score at "+ (i + 1) + " is " + scores.get(i));
        }
    }
    
}
