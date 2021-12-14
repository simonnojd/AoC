package _2021.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class puzzleA {

    static Byte[] epsilon = new Byte[12];
    static Byte[] gamma = new Byte[12];

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputs/2021/day3.txt"));
            List<String> lines = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            System.out.println(calculate(lines));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int calculate(List<String> lines) {
        for (int i = 0; i < 12; i++) {
            int counter = 0;
            for (String line : lines) {
                counter += Integer.parseInt(String.valueOf(line.charAt(i)));
            }
            if (counter > (lines.size() / 2)) {
                epsilon[i] = 1 ;
                gamma[i] = 0;
            } else {
                epsilon[i] = 0 ;
                gamma[i] = 1;
            }

        }

        System.out.println(Arrays.toString(epsilon));
        System.out.println(Arrays.toString(gamma));

        int test = 2048;
        int test2 = 2048;

        int epsilonDecimal = 0;
        int gammaDecimal = 0;

        for (byte b: epsilon) {
            epsilonDecimal += (b * test);
            test /= 2;
        }
        for (byte b: gamma) {
            gammaDecimal += (b * test2);
            test2 /= 2;
        }
        System.out.println(epsilonDecimal);
        System.out.println(gammaDecimal);


        return epsilonDecimal * gammaDecimal;
    }
}
