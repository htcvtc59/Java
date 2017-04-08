/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apj.rmi.libs;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Monkey.TNT
 */
public interface IConvert extends Remote {
    public double moneyConvert(String currency,int value)throws RemoteException;
    
    
}
