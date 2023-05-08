/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package AksesRMI;

import Entitas.StokBarang;
import Koneksi.Koneksi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Services.ServicesStokBarang;

/**
*
* @author Alya Aiman Salsabila Arif
*/
public class AksesStokBarang extends UnicastRemoteObject implements ServicesStokBarang{  
    public AksesStokBarang() throws RemoteException {
    }
 
    @Override
    public List getBarang() throws RemoteException {
        List listBarang=new ArrayList<>();
        Statement statement=null;
        try {
            statement=Koneksi.getConnection().createStatement();
            try (ResultSet resultSet = statement.executeQuery("select * from stokbarang")) {
                while (resultSet.next()) {
                    StokBarang barang=new StokBarang();
                    barang.setKode(resultSet.getInt(1));
                    barang.setNama(resultSet.getString(2));
                    barang.setJumlah(resultSet.getInt(3));
                    listBarang.add(barang);
                }
            }
            return listBarang;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        finally{
            if (statement!=null) {
                try {
                    statement.close();
                } catch (Exception e) {
                }
            }
        }
    }
    
    @Override
    public void insert(StokBarang barang) throws RemoteException {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Statement statement=null;
        try {
            statement= Koneksi.getConnection().createStatement();
            statement.executeUpdate("insert into stokbarang values ('"+barang.getKode()+"'"
                    + ",'"+barang.getNama()+"','"+barang.getJumlah()+"')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
 
        }finally{
            if (statement!=null) {
                try {
                    statement.close();
                } catch (Exception e) {
                } 
            }
        }
    }
 
    @Override
    public void update(StokBarang barang) throws RemoteException {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Statement statement=null;
        try {
            statement=Koneksi.getConnection().createStatement();
            statement.executeUpdate("update stokbarang set nama='"+barang.getNama() +
                "',jumlah='"+barang.getJumlah()+"'where kode='"+barang.getKode()+"'");
 
        } catch (Exception e) {
            System.out.println(e.getMessage());
 
        }finally{
            if (statement!=null) {
                try {
                    statement.close();
                } catch (Exception e) {
                }
 
            }
        }
    }
 
    @Override
    public void delete(StokBarang barang) throws RemoteException {
    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Statement statement=null;
        try {
            statement=Koneksi.getConnection().createStatement();
            statement.executeUpdate("delete from stokbarang where kode='"+barang.getKode()+"'");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            if (statement!=null) {
                try {
                    statement.close();
                } catch (Exception e) {
                }
            }
        }
    }
}