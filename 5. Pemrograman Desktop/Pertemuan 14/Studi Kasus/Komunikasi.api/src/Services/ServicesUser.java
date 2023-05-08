/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitas.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public interface ServicesUser extends Remote{
    List getUser()throws RemoteException;
    void insert(User user) throws RemoteException;
}