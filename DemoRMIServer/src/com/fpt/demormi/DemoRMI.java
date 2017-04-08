/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.demormi;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DatHT
 */
public class DemoRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CtoFServiceServer server = new CtoFServiceServer();
            Registry registry = LocateRegistry.createRegistry(6969);
            registry.bind("convertDegree", server);
            System.out.println("Server is listening port 6969...");
        } catch (RemoteException | AlreadyBoundException ex) {
            Logger.getLogger(DemoRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
