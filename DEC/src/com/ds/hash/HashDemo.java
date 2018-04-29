package com.ds.hash;

public class HashDemo {

	public static void main(String[] args) {
		HashTableArray<String> hm = new HashTableArray<>(10);
		hm.put(11, "sdasdsa1");
		hm.put(12, "sdasdsa2");
		hm.put(13, "sdasdsa3");
		hm.put(14, "sdasdsa4");
		hm.put(34, "sdasdsa5");
		System.out.println("Llaves: " + hm.get(35));
	}

}
