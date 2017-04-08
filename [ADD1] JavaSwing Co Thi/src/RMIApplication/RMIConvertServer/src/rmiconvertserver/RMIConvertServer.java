/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiconvertserver;

import api.rmi.server.Converter;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Monkey.TNT
 */
public class RMIConvertServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Converter converter = new Converter();
            int port = 12345;
            Registry registry = LocateRegistry.createRegistry(12345);
            Naming.rebind("rmi://localhost:"+ port +"/moneyConvert",converter);
            System.out.println("Server is running...");
            
        } catch (RemoteException ex) {
            Logger.getLogger(RMIConvertServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RMIConvertServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
