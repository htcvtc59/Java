/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author DatHT
 */
public class ExchangeImpl extends UnicastRemoteObject implements IExchange{

    public ExchangeImpl() throws RemoteException{
        super();
    }
    @Override
    public int USDtoVND(int usd) throws RemoteException {
        return usd*20000;
    }
    
}
