package control;

import com.mysql.cj.jdbc.Driver;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    public static Connection Connetion() {

        Connection connection = null;

        try {
            String user = "root";
            String pass = "";
            String driver = "com.mysql.cj.jdbc.Driver";
            String local = "jdbc:mysql://localhost:3308/projetoers";

            Class.forName(driver);
            connection = DriverManager.getConnection(local, user, pass);

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao conectar a database " + ex);
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar a database " + ex);

        }

        return connection;
    }

    public static void closeConnetion(Connection connection) {

        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
