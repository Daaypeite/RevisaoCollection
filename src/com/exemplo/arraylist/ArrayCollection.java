package com.exemplo.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayCollection {

	public static void main(String[] args) {
		// criar uma collection array
		ArrayList<String> lista = new ArrayList<String>(); // criando o array list
		lista.add("Um texto");
		lista.add("Dois textos");
		lista.add("Tres textos");

		// operador iterator
		Iterator textos = lista.iterator();

		// loop
		while (textos.hasNext()) {
			System.out.println(textos.next());
		}
	}
}
