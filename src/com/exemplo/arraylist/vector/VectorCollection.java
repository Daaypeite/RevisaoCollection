package com.exemplo.arraylist.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		Vector<String> vetorzinho = new Vector<String>();
		
		vetorzinho.add("Sou um vetorzinho1");
		vetorzinho.add("Sou um vetorzinho2");
		vetorzinho.add("Sou um vetorzinho3");
		vetorzinho.add("Sou um vetorzinho4");
		
		Iterator<String> vc = vetorzinho.iterator();
		
		// loop
		while(vc.hasNext()){
			System.out.println(vc.next());
		}

	}

}
