package _2015.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class puzzleA {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2015/day5.txt"));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            System.out.println(solvePuzzle(lines));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solvePuzzle(List<String> lines) {
        int niceStrings = 0;

        Pattern threeVowels = Pattern.compile("(.*[aeiou]){3}");
        Pattern doubleLetters = Pattern.compile("(.)\\1");
        Pattern badPattern = Pattern.compile("ab|cd|pq|xy");

        for (String line : lines) {
           if (!badPattern.matcher(line).find() && threeVowels.matcher(line).find() && doubleLetters.matcher(line).find()) {
               niceStrings++;
           }
        }

        return niceStrings;
    }
}
