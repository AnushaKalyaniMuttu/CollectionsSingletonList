package com.bean;

import java.util.Collections;
import java.util.List;

public class CollectionsSingletonList {
	
	/*
	 * List<T> singletonList=Collections.singletonList(T o)
	 * returns a immutable list adding or removing elements from the list 
	 * throws UnsupportedOperationException
	 */
	public static void main(String[] args) {
	List<String> singletonList=	Collections.singletonList("adljf");
	singletonList.add("A");
	singletonList.forEach(System.out::println);
	
}
		
	}
