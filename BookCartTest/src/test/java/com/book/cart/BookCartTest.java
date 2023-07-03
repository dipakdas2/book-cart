package com.book.cart;

import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BookCartTest {
	
	@Test
	public void test_firstCopy_price(){
		
		List<String> books = new ArrayList<String>();
		books.add(BookUtil.BOOK_ONE);
		
		double amount = BookCart.calculatePrice(books);
		
		Assert.assertThat(50.0, is(amount));
		
	}

}
