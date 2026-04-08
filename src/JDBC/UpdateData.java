package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
            try {
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/testdb",
                        "root",
                        "pavi0506"
                );

                String query = "UPDATE students SET age=25 WHERE id=101";

                Statement stmt = con.createStatement();
                stmt.executeUpdate(query);


                con.close();

            }catch (Exception e) {
                System.out.println(e);

            }
        }
    }





