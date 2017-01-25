package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.Context;
import javax.sql.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author willi
 */
public class Conexion {

    private static Connection conn;
    private static Conexion conexion;

    private DataSource ds = null;
    private Context ctx = null;

    public Conexion() {
    }

    public static Connection conectar() throws SQLException {
        if (conn == null) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                return conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "MERCACLICK", "MERCACLICK");
            } catch (Exception e) {
                System.out.println("ERROR CONEXION BASE DE DATOS " + e.getMessage());
                e.printStackTrace();
                return null;
            }
        }
        return conn;
    }

    public boolean cerrarConexion() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            conn = null;
        }
    }
}
