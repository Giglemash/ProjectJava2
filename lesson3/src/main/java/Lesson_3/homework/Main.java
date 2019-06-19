package Lesson_3.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        readFileInByteArray("48bytes.txt");
        mergeFiles("2-final.txt");
    }

    private static void readFileInByteArray(String inputFile) {

        FileInputStream in = null;
        try {
            new FileInputStream(inputFile);
            byte[] bytes = readAllBytes();//Java9
            System.out.println("Прочитано " + bytes.length + " байт в файле " + inputFile);
            for (byte b : bytes) {
                System.out.print(b + " ");
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void mergeFiles(String outputFile) {
        List<InputStream> al = new ArrayList<>();
        try {
            for (int i = 1; i < 6; i++) {
                al.add(new FileInputStream("2-" + i + ".txt"));
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        Enumeration<InputStream> enumeration = Collections.enumeration(al);
        SequenceInputStream sequence = new SequenceInputStream(enumeration);

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(outputFile);
            int rb = sequence.read();
            while (rb != -1) {
                out.write(rb);
                rb = sequence.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                sequence.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сформирован файл " + outputFile);
    }
}

