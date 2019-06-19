package Lesson_2;

import java.sql.*;

public class MainDB {

    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    public static void main(String[] args) {

        try {
            connect();

//            int res = stmt.executeUpdate("CREATE TABLE students (" +
//                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
//                    "name TEXT," +
//                    "score TEXT)");

//            long time = System.currentTimeMillis();
////
//          //  connection.setAutoCommit(false);
//            for (int i = 0; i < 1000; i++) {
//                String name = "Bob" + i;
//                String sql = String.format("INSERT INTO students (name, score) VALUES ('%s', '%s')", name, i);
//                stmt.addBatch(sql);
//            }
//            stmt.executeBatch();
//
//           // connection.setAutoCommit(true);
//            System.out.println(System.currentTimeMillis() - time);






            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob1', '10')");
            Savepoint spl = connection.setSavepoint();
            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob2', '20')");
            connection.rollback(spl);
            connection.setAutoCommit(true);
            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob3', '30')");







        //    String sql = String.format("INSERT INTO students (name, score) VALUES (?, ?)", "Bob77", 55);
//            pstmt = connection.prepareStatement("INSERT INTO students (name, score) VALUES (?, ?);");
//            pstmt.setString(1, "Bob77");
//            pstmt.setInt(2, 55);
//
//            pstmt.execute();

          //  System.out.println(res);
           // ResultSetMetaData rsmd = rs.getMetaData();


//            System.out.println(rs.getInt(1) + " " + rs.getString("name") +" " + rs.getInt(3));
//            for (int i = 1; i <= rsmd.getColumnCount() ; i++) {
//                if (i == rsmd.getColumnCount()) {
//                    System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnType(i));
//                } else {
//
//                    System.out.print(rsmd.getColumnName(i) + " " + rsmd.getColumnType(i));
//                }
//            }

//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString("name") +" " + rs.getInt(3));
//            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public static void connect() throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:MainDB.db");
        stmt = connection.createStatement();

    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
