package employee_management_system;
//
//72% of storage used … If you run out, you can't create, edit, and upload files. Get 100 GB of storage for ₹130.00 ₹0 for 1 month.
//     

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;

    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","Adityajod@2003");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}