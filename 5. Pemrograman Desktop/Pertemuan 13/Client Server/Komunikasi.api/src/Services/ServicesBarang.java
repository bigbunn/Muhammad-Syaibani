/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitas.Barang;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
*
* @author Alya Aiman Salsabila Arif
*/
public interface ServicesBarang extends Remote{
    List getBarang()throws RemoteException;//untuk select data menampung data mahasiswa
    void insert(Barang barang) throws RemoteException;
    void update(Barang barang) throws RemoteException;
    void delete(Barang barang) throws RemoteException; 
}
