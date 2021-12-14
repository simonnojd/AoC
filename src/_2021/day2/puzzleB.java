package _2021.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class puzzleB {
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
        int horizontal = 0;
        int depth = 0;
        int aim = 0;
        String[] instructions;
        for (String line: lines) {
            instructions = line.split(" ");
            if (instructions[0].equals("forward")) {
                horizontal += Integer.parseInt(instructions[1]);
                depth += aim * Integer.parseInt(instructions[1]);
            } else if(instructions[0].equals("up")) {
                aim -= Integer.parseInt(instructions[1]);
            } else {
                aim += Integer.parseInt(instructions[1]);
            }
        }
        return horizontal * depth;
    }
}
