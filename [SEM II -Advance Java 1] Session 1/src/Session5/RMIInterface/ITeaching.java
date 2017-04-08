/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session5.RMIInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author MacOS
 */
public interface ITeaching extends Remote {

    String teach() throws RemoteException;

    int add(int x, int y) throws RemoteException;
}
