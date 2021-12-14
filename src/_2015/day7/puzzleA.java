package _2015.day7;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class puzzleA {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2015/day7.txt"));
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
        System.out.println(Arrays.toString("dq".getBytes(StandardCharsets.UTF_8)));
        return 0;
    }
}
