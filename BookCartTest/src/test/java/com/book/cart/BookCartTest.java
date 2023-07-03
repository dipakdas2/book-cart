package com.book.cart;

import java.util.List;
import java.util.ArrayList;
import org.junit.Assert;

import org.junit.Test;

public class BookCartTest {
	
	@Test
	public void test_firstCopy_price(){
		
		List<String> books = new ArrayList<String>();
		books.add(BookUtil.BOOK_ONE);
		
		double amount = BookCart.calculatePrice(books);
		
		Assert.assertEquals(50.0, amount);
		
	}

}
