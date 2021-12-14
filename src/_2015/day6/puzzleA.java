package _2015.day6;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class puzzleA {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2015/day6.txt"));
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
        int litLights = 0;
        int x = 0;
        int y = 0;
        Point coordinate = new Point(x,y);

        return litLights;
    }
}
