package _2021.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class puzzleA {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2021/day2.txt"));
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            System.out.println(calculate(lines));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int calculate(List<String> lines) {
        String[] instructions;
        int horizontalValue = 0;
        int depth = 0;
        for (String line: lines) {
            instructions = line.split(" ");
            if (instructions[0].equals("forward")) {
                horizontalValue += Integer.parseInt(instructions[1]);
            } else if (instructions[0].equals("up")) {
                depth -= Integer.parseInt(instructions[1]);
            } else {
                depth += Integer.parseInt(instructions[1]);
            }
        }
        return horizontalValue * depth;
    }
}
