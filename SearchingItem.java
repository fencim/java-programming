import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SearchingItem {
    static ArrayList<Integer> scores = new ArrayList<Integer>();
    public static void main(String[] args) {
        readInput();
        bubbleSort();
        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("Please enter item to search on:");
            int item = userInput.nextInt();
            int index = binarySearch(item);
            if (index >= 0) {
                System.out.println("Item Exists at index " + index);
            } else {
                System.out.println("Item does Exists");
            }
            print();
        } while (userInput.hasNextInt());
        userInput.close();
    }
    static int searchItem(int item) {
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) == item) {
                return i;
            }
        }
        return -1;
    }
    static int binarySearch(int item) {
        return binarySearch(item, 0, scores.size() - 1);   
    }
    static int binarySearch(int item, int startIndex, int endIndex) {
        if (endIndex <= startIndex) {
            return -1;
        }
        int centerIndex = startIndex + ((endIndex - startIndex) / 2);
        int centerValue = scores.get(centerIndex);
        if (centerValue == item) {
            return centerIndex;
        } else if (centerIndex == startIndex && scores.get(endIndex) == item){
            return endIndex;
        } else if (centerIndex == startIndex){
            return -1;
        } else if (centerValue > item) {
            return binarySearch(item, centerIndex, endIndex);
        } else {
            return binarySearch(item, startIndex, centerIndex);
        }

    }
    static void readInput() {
        try {
            Scanner in = new Scanner(new File("in.txt"));
            while (in.hasNextInt()) {
                int score = in.nextInt();
                scores.add(score);
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    static void print() {
        for (int i = 0; i < scores.size(); i++) {
            System.out.print(scores.get(i) + " ");
        }
        System.out.println("");
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
}
