package _2015.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class puzzleA {

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
        int wrappingPaper = 0;
        for (String line: lines) {
            String[] values;
            values = line.split("x");
            int l = Integer.parseInt(values[0]);
            int w = Integer.parseInt(values[1]);
            int h = Integer.parseInt(values[2]);
            wrappingPaper += (2 * l * w) + (2 * w * h) + (2 * h * l);
            wrappingPaper += Collections.min(Arrays.asList(l * w, w * h, h * l));
        }
        return wrappingPaper;
    }
}
