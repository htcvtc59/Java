/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.rmi.server;

import apj.rmi.libs.IConvert;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Iterator;

/**
 *
 * @author Monkey.TNT
 */
public class Converter extends UnicastRemoteObject implements IConvert {

    public Converter() throws RemoteException {
    }

    @Override
    public double moneyConvert(String currency, int value) throws RemoteException {
        switch (currency) {
            case "USD":
                return value / 21345;
            case "EUR":
                return value / 23123;
            default:
                throw new RemoteException(currency + " not supported");

        }

    }

}
