
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Monkey.TNT
 */
public class ConvertImplement extends UnicastRemoteObject implements IEchange {

    public ConvertImplement() throws RemoteException {
        super();
    }

    @Override
    public double convert(double amount, String currency) throws RemoteException {
        double cv = 0;
        if (currency.equalsIgnoreCase("USD")) {
            cv = amount / 22500;
        } else if (currency.equalsIgnoreCase("EUR")) {
            cv = amount / 24000;
        } else if (currency.equalsIgnoreCase("INR")) {
            cv = amount / 14800;
        }
        return cv;
    }

}
