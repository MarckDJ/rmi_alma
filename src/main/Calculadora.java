package main;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
	int suma(int no1,int no2)throws RemoteException;
	
}
