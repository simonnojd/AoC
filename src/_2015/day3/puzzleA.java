package _2015.day3;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class puzzleA {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2015/day3.txt"));
            Set<Point> set = new HashSet<>();
            System.out.println(calculate(reader.readLine(), set));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int calculate(String line, Set<Point> set) {
        int x = 0;
        int y = 0;

        char instruction;

        for (int i = 0; i < line.length(); i++) {
            instruction = line.charAt(i);
            switch (instruction) {
                case '>' -> x++;
                case '<' -> x--;
                case '^' -> y++;
                case 'v' -> y--;
            }
            set.add(new Point(x, y));
        }
        return set.size();
    }
}
