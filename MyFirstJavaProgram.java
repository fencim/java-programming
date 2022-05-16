import java.util.ArrayList;
public class MyFirstJavaProgram {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(12);
        scores.add(0);
        scores.add(5);
        System.out.println(scores.size());
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }

        Object[] arrayScores = scores.toArray();
        System.out.println(arrayScores.length);
        for (int i = 0; i < arrayScores.length; i++) {
            System.out.println(arrayScores[i]);
        }
    }
}
