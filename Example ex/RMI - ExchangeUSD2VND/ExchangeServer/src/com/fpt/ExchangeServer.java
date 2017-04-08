/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DatHT
 */
public class ExchangeServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ExchangeImpl exchangeObj=new ExchangeImpl();
            Registry registry=LocateRegistry.createRegistry(9999);
            Naming.bind("rmi://127.0.0.1:9999/exchange", exchangeObj);
            System.out.println("Server started");
        } catch (RemoteException ex) {
            Logger.getLogger(ExchangeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ExchangeServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ExchangeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
