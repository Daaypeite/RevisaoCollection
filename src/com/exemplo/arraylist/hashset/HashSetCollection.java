package com.exemplo.arraylist.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

	public static void main(String[] args) {
		HashSet<String> conjunto = new HashSet<String>();
		
		conjunto.add("Um valor");
		conjunto.add("outro valor");
		conjunto.add("Um valor");
		conjunto.add("Mais um valor");
		
		Iterator<String> hs = conjunto.iterator();
		
		// loop
		while(hs.hasNext()){
		System.out.println(hs.next());

	}
	}
}
