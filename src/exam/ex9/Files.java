package exam.ex9;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.nio.file.Files.newBufferedReader;

public class Files {

    public static void main(String[] args) throws IOException {

        FileWriter file1 = null;
        FileWriter file2 = null;
        List<String> list = new ArrayList<>();

        try {
            file1 = new FileWriter(".\\src\\exam\\ex9\\in1.txt");
            file2 = new FileWriter(".\\src\\exam\\ex9\\in2.txt");
            for (int i = 1; i <= 1000; i++) {
                file1.write(new Random().nextInt(100000) + "\n");
                file2.write(new Random().nextInt(100000) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ((file1 != null)) {
                try {
                    file1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if ((file2 != null)) {
                try {
                    file2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        try (BufferedReader bf1 =
                     newBufferedReader(Paths.get(".\\src\\exam\\ex9\\in1.txt"))) {
            String line1;
            while((line1 = bf1.readLine())!= null) {
                list.add(line1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try (BufferedReader br2 = newBufferedReader(Paths.get(".\\src\\exam\\ex9\\in2.txt"))) {
            String line2;
            while ((line2 = br2.readLine()) != null) {
                list.add(line2);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        List<Integer> sortedList = list.stream()
                .map(Integer::parseInt)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        File file3 = new File(".\\src\\exam\\ex9\\out.txt");

        try (FileWriter out = new FileWriter(file3)) {
            for (Integer element : sortedList) {
                out.write(element + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
