package com.book.cart;

import java.util.List;

public class BookCart {

	public static double calculatePrice(List<String> books){
		if(books.size() == 1) return 50.0;
		
		return 0;
	}
}
