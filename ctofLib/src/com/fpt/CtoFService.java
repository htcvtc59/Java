/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author DatHT
 */
public interface CtoFService extends Remote{
   public float CtoF(float c) throws RemoteException;    
}
