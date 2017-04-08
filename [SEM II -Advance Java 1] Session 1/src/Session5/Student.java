/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session5;

import Session5.RMIInterface.ITeaching;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author MacOS
 */
public class Student extends UnicastRemoteObject implements ITeaching{
    String name;

    public Student(String name) throws RemoteException {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }
//    Teach
    public String teach(){
       return  (name+"is teaching");
    }

    @Override
    public int add(int x, int y) throws RemoteException {
       return x+y;
    }

    
}
