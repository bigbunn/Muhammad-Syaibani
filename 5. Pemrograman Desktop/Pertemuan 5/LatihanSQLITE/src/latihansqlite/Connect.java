/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansqlite;

import java.sql.*;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class Connect {
    private static Connection con;
    private static Statement st;
    
    public static Statement connection(){
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:kampus.db";
            con = DriverManager.getConnection(url);
            st = con.createStatement();
            System.out.println("Koneksi Sukses!");
        }catch (Exception ex){
            System.out.println("Koneksi Gagal!");
        }
        return st;
    }
}
