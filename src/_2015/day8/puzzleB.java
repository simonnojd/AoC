package _2015.day8;

import _2015.FileIO;

import java.util.List;

public class puzzleB {

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

        int embiggen = lines.stream()
                .map(x -> x.replaceAll("\\\\x[0-9a-f]{2}", "XXXXX"))
                .map(x -> x.replace("\\\"", "QQQQ"))
                .map(x -> x.replace("\\\\", "SSSS"))
                .mapToInt(x -> x.length() + 4)
                .sum();

        return embiggen - literals;
    }
}
