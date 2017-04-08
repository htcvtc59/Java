/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MacOS
 */
public class Calculationlib {

    public static void main(String[] args) throws MalformedURLException {
        try {
            Student hai = new Student("Hai");
            Student minh = new Student("minh");
            LocateRegistry.createRegistry(1099);
            Naming.rebind("hai", hai);
            Naming.rebind("minh", hai);
            System.out.println("Server is ready");
        } catch (RemoteException ex) {
            Logger.getLogger(Calculationlib.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
