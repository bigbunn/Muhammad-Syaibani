/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import AksesRMI.AksesBarang;
import AksesRMI.AksesUser;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
*
* @author Alya Aiman Salsabila Arif
*/
public class Server {
    public static void main(String[] args) throws RemoteException {
        
        Registry registry=LocateRegistry.createRegistry(1099);
        
        AksesBarang aksesBarang = new AksesBarang();
        AksesUser aksesUser = new AksesUser();
        
        registry.rebind("barang",(Remote) aksesBarang);
        registry.rebind("user",(Remote) aksesUser);
        System.out.println("server jalan");
    } 
}
