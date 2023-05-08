/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AksesRMI;

import Entitas.UserLogin;
import Koneksi.Koneksi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import Services.ServicesUserLogin;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public class AksesUserLogin extends UnicastRemoteObject implements 
        ServicesUserLogin {
    public AksesUserLogin() throws RemoteException {
        
    }
    
    @Override
    public List getUser() throws RemoteException {
        List listUser = new ArrayList<>();
        Statement statement = null;
        try {
            statement = Koneksi.getConnection().createStatement();
            try (ResultSet resultSet = statement.executeQuery(
                    "select * from user")){
                while(resultSet.next()) {
                    UserLogin user = new UserLogin();
                    user.setId(Integer.valueOf(resultSet.getString(1)));
                    user.setUsername(resultSet.getString(2));
                    user.setPassword(resultSet.getString(3));
                    listUser.add(user);
                }
            }
            return listUser;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (Exception e) {
                }
            }
        }
    }
    
    public void insert(UserLogin user) throws RemoteException {
        Statement statement = null;
        try {
            statement = Koneksi.getConnection().createStatement();
            String newuser = enkripsi(user.getUsername());
            String newpass = enkripsi(user.getPassword());
            statement.executeUpdate("insert into user (username, password) values ('" 
                    + newuser + "','"+newpass+"')");
        } catch (Exception e) {
            System.out.println("gagal");
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                }
            }
        }
    }
    
    @Override
    public boolean login(UserLogin user) throws RemoteException {
        Statement statement = null;
        try {
            statement = Koneksi.getConnection().createStatement();
            String newuser = enkripsi(user.getUsername());
            String newpass = enkripsi(user.getPassword());
            try (ResultSet resultSet = statement.executeQuery("select * from user where username='" 
                    + newuser + "' and password='" + newpass + "'")) {
                return resultSet.next();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
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
    
    public String enkripsi(String plain) throws NoSuchAlgorithmException, NoSuchProviderException,
            NoSuchPaddingException, InvalidKeyException, ShortBufferException, IllegalBlockSizeException,
            BadPaddingException{
        // TODO code application logic here
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        byte[] input = plain.getBytes();
        byte[] keyBytes = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
        0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f };
        
        SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");
        
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        
        System.out.println(new String(input));
        
        // encryption pass
        cipher.init(Cipher.ENCRYPT_MODE, key);
        
        byte[] cipherText = new byte[cipher.getOutputSize(input.length)];
        int ctLength = cipher.update(input, 0, input.length, cipherText, 0);
        ctLength += cipher.doFinal(cipherText, ctLength);
        String newpass = (new String(cipherText));
        System.out.println(newpass);
        return newpass;
        
        
    }
    
    public String dekripsi(String plain) throws NoSuchAlgorithmException, NoSuchProviderException, 
            NoSuchPaddingException, InvalidKeyException, ShortBufferException, IllegalBlockSizeException, 
            BadPaddingException{
        // TODO code application logic here
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        byte[] input = plain.getBytes();
        byte[] keyBytes = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
        0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f };
        
        SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");
        
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        
        System.out.println(new String(input));
        
        // decryption pass
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] plainText = new byte[cipher.getOutputSize(input.length)];
        int ptLength = cipher.update(input, 0, input.length, plainText, 0);
        ptLength += cipher.doFinal(plainText, ptLength);
        String pass = (new String(plainText));  
        return pass;
    }

    
}
