/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitas.StokBarang;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
*
* @author Alya Aiman Salsabila Arif
*/
public interface ServicesStokBarang extends Remote{
    List getBarang()throws RemoteException;//untuk select data menampung data mahasiswa
    void insert(StokBarang barang) throws RemoteException;
    void update(StokBarang barang) throws RemoteException;
    void delete(StokBarang barang) throws RemoteException; 
}
