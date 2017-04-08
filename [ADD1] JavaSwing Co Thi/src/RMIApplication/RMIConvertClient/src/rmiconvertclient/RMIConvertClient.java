/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiconvertclient;

import apj.rmi.libs.IConvert;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Monkey.TNT
 */
public class RMIConvertClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            IConvert convert = (IConvert) Naming.lookup("rmi://localhost:12345/moneyConvert");
        String currency ="USD";
        int vnd = 1000000;
        double usd= convert.moneyConvert(currency, vnd);
        currency="EUR";
        double eur = convert.moneyConvert(currency, vnd);
            System.out.println(vnd+ " VND = "+usd+" USD");    
            System.out.println(vnd+ " EUR = "+eur+" EUR");    
                
        } catch (NotBoundException ex) {
            Logger.getLogger(RMIConvertClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RMIConvertClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RMIConvertClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
