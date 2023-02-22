import java.util.ArrayList;
import java.util.Scanner;

public class CodeforcesChecking {

    static final int BEGINNING = 1, END = 26;

    public static void main(String[] args) {

        String problemString = "codeforces";

        Scanner numberOfCases = new Scanner(System.in);
        int t;
        String letter;
        ArrayList<String> memoryInAnswers = new ArrayList<>();

        System.out.println("Desired number of test cases is: ");
        t = numberOfCases.nextInt();
        while ((BEGINNING > t) || (END < t)) {
            System.out.println("Error: out of bound! Please input a value between 1 and 26: ");
            t = numberOfCases.nextInt();
        }
        for (int i = 0; i < t; i++) {
            letter = numberOfCases.next();
            if (problemString.contains(letter)) {
                memoryInAnswers.add("yes");
            } else {
                memoryInAnswers.add("no");
            }
        }
        for (String answer : memoryInAnswers) {
            System.out.println(answer);
        }
    }
}



