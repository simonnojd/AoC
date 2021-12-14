package _2015.day3;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class puzzleB {

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
        int santaX = 0;
        int santaY = 0;

        int roboX = 0;
        int roboY = 0;

        char instruction;

        for (int i = 0; i < line.length(); i++) {
            instruction = line.charAt(i);
            switch (instruction) {
                case '>' -> {
                    if (i % 2 == 0) {
                        santaX++;
                    } else {
                        roboX++;
                    }
                }
                case '<' -> {
                    if (i % 2 == 0) {
                        santaX--;
                    } else {
                        roboX--;
                    }
                }
                case '^' -> {
                    if (i % 2 == 0) {
                        santaY++;
                    } else {
                        roboY++;
                    }
                }
                case 'v' -> {
                    if (i % 2 == 0) {
                        santaY--;
                    } else {
                        roboY--;
                    }
                }
            }
            set.add(new Point(santaX, santaY));
            set.add(new Point(roboX, roboY));
        }
        return set.size();
    }
}
