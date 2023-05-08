/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entitas.UserLogin;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Alya Aiman Salsabila Arif
 */
public interface ServicesUserLogin extends Remote{
    List getUser()throws RemoteException;
    void insert(UserLogin user) throws RemoteException;
    boolean login(UserLogin user)throws RemoteException;
}