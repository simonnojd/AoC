package _2015.day8;

import _2015.FileIO;
import java.util.List;

public class puzzleA {
    public static void main(String[] args) {
        try {
            List<String> lines = FileIO.getFileAsList("inputs/2015/day8.txt");
            System.out.println(solvePuzzle(lines));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solvePuzzle(List<String> lines) {
        int literals = lines.stream()
                .mapToInt(String::length).sum();

        int memory = lines.stream()
                .map(x -> x.replace("\\\\", "S"))
                .map(x -> x.replace("\\\"", "Q"))
                .map(x -> x.replaceAll("\"", ""))
                .map(x -> x.replaceAll("\\\\x[0-9a-f]{2}", "X"))
                .mapToInt(String::length)
                .sum();

        return literals - memory;
    }

}
