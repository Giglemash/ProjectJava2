package Lesson_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainIO {
    public static void main(String[] args) throws IOException {
//        File file = new File("123");
//
//        String[] mass = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.startsWith("1");
//            }
//        });
//        for (String name: mass) {
//            System.out.println(name);
//        }


//        File f = new File("123/newFile.txt");
//        f.createNewFile();

//        File file = new File("123/newFile.txt");
//        System.out.println(file.getAbsolutePath());

        //  file.renameTo(new File("123/newFile1.txt"));


//        long t = System.currentTimeMillis();
//        try (FileInputStream in = new FileInputStream("123/2.txt")) {
//            int x;
//            while ((x = in.read()) != -1) {
//                System.out.print((char)x);
//            }
//        }
//        System.out.println(System.currentTimeMillis() - t);

//        long t = System.currentTimeMillis();
//        try (FileInputStream in = new FileInputStream("123/2.txt")) {
//            byte[] arr = new byte[100];
//            int x;
//            while ((x = in.read(arr)) > 0) {
//                System.out.print(new String(arr, 0, x, "UTF-8"));
//            }
//        }
//        System.out.println(System.currentTimeMillis() - t);


//        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("123/2.txt"), "UTF-8")) {
//            int x;
//            while ((x = isr.read()) != -1) {
//                System.out.print( x);
//            }
//        }

//        long t = System.currentTimeMillis();
//        BufferedReader br = null;
//        FileReader fr = null;
//
//        fr = new FileReader("123/2.txt");
//        br = new BufferedReader(fr);
//
//        String currentLine;
//
//        while ((currentLine = br.readLine()) != null) {
//            System.out.println(currentLine);
//        }
//        System.out.println(System.currentTimeMillis() - t);
//        br.close();
//        fr.close();

//        PipedInputStream in = null;
//        PipedOutputStream out = null;
//
//
//        in = new PipedInputStream();
//        out = new PipedOutputStream();
//        out.connect(in);
//
//        for (int i = 0; i < 100; i++) {
//            out.write(i);
//        }
//
//        int x;
//        while ((x = in.read()) != -1) {
//            System.out.println(x);
//        }
//
//        in.close();
//        out.close();


//        ArrayList<InputStream> ali = new ArrayList<>();
//        ali.add(new FileInputStream("123/1.txt"));
//        ali.add(new FileInputStream("123/2.txt"));
//        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(ali));
//        int x;
//
//        while ((x = in.read()) != -1) {
//            System.out.print((char)x);
//        }
//
//        in.close();


//        try (RandomAccessFile raf = new RandomAccessFile("123/2.txt", "rw")) {
//            raf.seek(2);
//            System.out.println((char) raf.read());
//        }

    }
}
