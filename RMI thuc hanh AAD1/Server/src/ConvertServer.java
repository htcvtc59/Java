
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Monkey.TNT
 */
public class ConvertServer {

    public static void main(String[] args) {
        try {
            ConvertImplement exchangeObj = new ConvertImplement();
            Registry registry = LocateRegistry.createRegistry(9999);
            Naming.bind("rmi://127.0.0.1:9999/exchange", exchangeObj);
            System.out.println("Server started");
        } catch (RemoteException | MalformedURLException | AlreadyBoundException ex) {
            Logger.getLogger(ConvertServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
