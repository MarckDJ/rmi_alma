package main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
	public static void main(String[] args) {
		try {
			CalculadoraImpl obj = new CalculadoraImpl();
			Calculadora stub = (Calculadora) UnicastRemoteObject.exportObject(obj, 0);
			Registry registry = LocateRegistry.getRegistry(1090);
			registry.rebind("calc", stub);
			System.out.println("Servidor listo");
		} catch (Exception e) {
			System.err.println(e.toString());
			e.printStackTrace();
		}
	}
}
