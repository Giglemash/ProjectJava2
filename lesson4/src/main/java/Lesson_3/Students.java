package Lesson_3;

import java.io.*;

public class Students implements Serializable {
    int id;
    String name;

    transient Book title;

    public Students(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public void info() {
        System.out.println(id + " " + name);
    }
}


class MainS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Students s = new Students(2, "Bob");
//        Book book = new Book("Book Name");
//        s.title = book;
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stud.ser"));
//        oos.writeObject(s);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.ser"));
        Students s2 = (Students) ois.readObject();
        ois.close();
        s2.info();
        Book book = s2.title;
        System.out.println(book);
    }
}
