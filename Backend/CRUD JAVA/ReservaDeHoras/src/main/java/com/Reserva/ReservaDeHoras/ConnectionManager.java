package com.Reserva.ReservaDeHoras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static Connection connection = null;
    private static String connectionString = "jdbc:sqlserver://localhost:1433; " +
            "databasename=reserva_de_horas;integratedSecurity=true";

    public static Connection obtenerConexion() throws SQLException {
        if(connection==null)
            connection = DriverManager.getConnection(connectionString);
        return connection;
    }
}
