/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteAdder extends UnicastRemoteObject implements Adder {
    RemoteAdder() throws RemoteException {
        super();
    }

    public int add(int x, int y) {
        return x + y;
    }
}

