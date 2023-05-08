/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import AksesRMI.AksesBarang;
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
        
        AksesBarang aksesBarang=new AksesBarang();
        registry.rebind("barang",(Remote) aksesBarang);
        
        System.out.println("server jalan");
    } 
}
