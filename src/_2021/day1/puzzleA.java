package _2021.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class puzzleA {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2021/day1.txt"));
            List<Integer> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(Integer.parseInt(line));
            }
            System.out.println(calculateDepth(lines));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int calculateDepth(List<Integer> lines) {
        int answer = 0, i = 0;
        while (i < lines.size() - 1) {
            if (lines.get(i) < (lines.get(i + 1))) {
                answer++;
            }
            i++;
        }
        return answer;
    }
}
