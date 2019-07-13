package com.mounika.java.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Mouni");
		list.add("Sree");
		list.add(1, "Ashwani");
		System.out.println(list.size()+ " " + list);
		list.add(1, "Priya");
		System.out.println(list);
		
		}
	

}
