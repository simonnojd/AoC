package _2015.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class puzzleA {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2015/day1.txt"));
            String[] lines = new String[1];
            lines[0] = reader.readLine();
            System.out.println(calculate(lines));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int calculate(String[] lines) {
        int floor = 0;
        for (int i = 0; i < lines[0].length(); i++) {
            if (lines[0].charAt(i) == '(') {
                floor++;
            } else {
                floor--;
            }
        }
        return floor;
    }

}
