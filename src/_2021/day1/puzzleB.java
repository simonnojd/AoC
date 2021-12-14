package _2021.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class puzzleB {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2021/day1.txt"));
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
       int answer = 0;
       int i = 0;
       while (i < lines.size()-3) {
           if (Integer.parseInt(lines.get(i)) + Integer.parseInt(lines.get(i+1)) + Integer.parseInt(lines.get(i+2)) < Integer.parseInt(lines.get(i+1)) +Integer.parseInt(lines.get(i+2)) + Integer.parseInt(lines.get(i+3))) {
               answer++;
           }
           i++;
       }
       return answer;
    }
}
