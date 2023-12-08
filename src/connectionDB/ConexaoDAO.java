package connectionDB;

import javax.swing.*;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

public class ConexaoDAO {
    public Connection conectaBD(){
        Connection conn = null;

        try {
            
            String url = "jdbc:mysql://localhost:3306/deliveryDB?user=root&password=";
            conn = DriverManager.getConnection(url);

        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conn;
    }
}
