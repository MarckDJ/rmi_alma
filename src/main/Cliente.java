package main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
	public static void main(String[] args) {
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(Integer.parseInt(host));
			Calculadora stub = (Calculadora) registry.lookup("calc");
			int response = stub.suma(5, 9);
			System.out.println("response: " + response);
		} catch (Exception e) {
			System.err.println(e.toString());
			e.printStackTrace();
		}
	}
}
