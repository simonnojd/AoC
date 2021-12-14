package _2015.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class puzzleB {

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

        Pattern repeatingLetter = Pattern.compile("(.).\\1");
        Pattern pairOfTwoLetters = Pattern.compile("(..).*\\1");

        for (String line : lines) {
            if (repeatingLetter.matcher(line).find() && pairOfTwoLetters.matcher(line).find()) {
                niceStrings++;
            }
        }

        return niceStrings;
    }
}
