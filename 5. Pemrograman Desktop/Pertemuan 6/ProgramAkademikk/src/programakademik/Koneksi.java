/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programakademik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class Koneksi {
    private static Connection con; 
    public static Connection getKoneksi (){
        try { 
            String url = "jdbc:mysql://localhost/akademik"; 
            String user = "root"; 
            String password = ""; 
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            con = DriverManager.getConnection(url, user, password); 
            System.out.println("koneksi sukses"); 
        } catch (SQLException t) { 
            System.out.println("Error Membuat Koneksi"); 
        } 
    return con; 
    }
}