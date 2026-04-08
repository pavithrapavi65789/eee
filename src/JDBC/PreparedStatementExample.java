package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "pavi0506"
            );
            String query = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 101);
            ps.setString(2, "Anjali");
            ps.setInt(3, 95);

            System.out.println("Dtat Inserted Sucessfully");

            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}