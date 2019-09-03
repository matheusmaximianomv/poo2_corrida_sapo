package poo.corrida.main;

import poo.corrida.sapos.Sapo;

public class Main {
	
	final static int AMOUNT_FROGS = 5;
	final static int DISTANCE = 500;
	
	public static void main (String[] args) {
		for(int i = 1; i <= AMOUNT_FROGS; i++ ) {
			new Sapo("SAPO: " + i, DISTANCE).start();
		}
	}
	
}
