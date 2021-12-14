package _2015.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class puzzleB {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2015/day2.txt"));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            System.out.println(calculate(lines));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int calculate(List<String> lines) {
        int bow = 0;
        int ribbon = 0;

        for (String line : lines) {
            int[] numberArray = new int[3];

            String[] values;
            values = line.split("x");

            int length = Integer.parseInt(values[0]);
            int width = Integer.parseInt(values[1]);
            int height = Integer.parseInt(values[2]);

            bow += length * width * height;

            numberArray[0] = length;
            numberArray[1] = width;
            numberArray[2] = height;

            Arrays.sort(numberArray);

            ribbon += 2 * (numberArray[0] + numberArray[1]);
        }
        return bow + ribbon;
    }
}
