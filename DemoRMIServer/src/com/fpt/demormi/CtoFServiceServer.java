/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.demormi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 *
 * @author DatHT
 */
public class CtoFServiceServer extends UnicastRemoteObject implements com.fpt.CtoFService{

    public CtoFServiceServer() throws RemoteException {
        
    }  
    @Override
    public float CtoF(float c) throws RemoteException {
        return c * ((float)9/5) + 32;
    }
    
}
