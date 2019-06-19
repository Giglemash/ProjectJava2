package Lesson_3.homework;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Reader {

    private static final int pageLettersNumber = 1800;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        File book = new File("Tester.txt");
        long pageCount = book.length() / pageLettersNumber;

        RandomAccessFile readBook = new RandomAccessFile(book, "r");
        while (true) {
            System.out.println("Количество страниц: " + pageCount + "\nВведите номер страницы:");
            int userPage = sc.nextInt();
            if (userPage < 1 || userPage > pageCount) {
                System.out.println("Такой страницы не существует.");
                continue;
            }
            int position = pageLettersNumber * (userPage - 1);
            readBook.seek(position);
            for (int i = 0; i < pageLettersNumber / 4; i++) {
                System.out.println(readBook.readLine());
            }
        }
    }
}
