
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monkey.TNT
 */
public interface IEchange extends Remote {
     public double convert(double amount,String currency) throws RemoteException;
}
