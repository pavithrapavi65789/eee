package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "pavi0506"
            );
            System.out.println("Connected Successfully!");

            con.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}