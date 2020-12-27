package main;

import java.rmi.RemoteException;

public class CalculadoraImpl implements Calculadora {
	public CalculadoraImpl() {

	}

	public int suma(int no1, int no2) throws RemoteException {
		return no1 + no2;
	}
}
