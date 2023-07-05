package com.book.cart;

import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BookCartTest {
	
	@Test
	public void test_firstCopy_price(){
		
		BookCart bookCart = new BookCart();
		List<String> books = new ArrayList<String>();
		books.add(BookUtil.BOOK_ONE);
		
		double amount = bookCart.calculateCartPrice(books);
		
		Assert.assertThat(50.0, is(amount));
		
	}
	
	@Test
	public void test_firstTwoCopy_price(){
		
		BookCart bookCart = new BookCart();
		List<String> books = new ArrayList<String>();
		books.add(BookUtil.BOOK_ONE);
		books.add(BookUtil.BOOK_TWO);
		
		double amount = bookCart.calculateCartPrice(books);
		
		Assert.assertThat(95.0, is(amount));
		
	}
	
	@Test
	public void test_firstThreeCopy_price(){
		
		BookCart bookCart = new BookCart();
		List<String> books = new ArrayList<String>();
		books.add(BookUtil.BOOK_ONE);
		books.add(BookUtil.BOOK_TWO);
		books.add(BookUtil.BOOK_THREE);
		
		double amount = bookCart.calculateCartPrice(books);
		
		Assert.assertThat(135.0, is(amount));
		
	}
	
	@Test
	public void test_firstFourCopy_price(){
		
		BookCart bookCart = new BookCart();
		List<String> books = new ArrayList<String>();
		books.add(BookUtil.BOOK_ONE);
		books.add(BookUtil.BOOK_TWO);
		books.add(BookUtil.BOOK_THREE);
		books.add(BookUtil.BOOK_FOUR);
		
		double amount = bookCart.calculateCartPrice(books);
		
		Assert.assertThat(160.0, is(amount));
		
	}
	
	
	@Test
	public void test_firstFiveCopy_price(){
		
		BookCart bookCart = new BookCart();
		List<String> books = new ArrayList<String>();
		books.add(BookUtil.BOOK_ONE);
		books.add(BookUtil.BOOK_TWO);
		books.add(BookUtil.BOOK_THREE);
		books.add(BookUtil.BOOK_FOUR);
		books.add(BookUtil.BOOK_FIVE);
		
		double amount = bookCart.calculateCartPrice(books);
		
		Assert.assertThat(187.5, is(amount));
		
	}
	
	@Test
	public void test_MultiCopy_price(){
		
		BookCart bookCart = new BookCart();
		List<String> books = new ArrayList<String>();
		books.add(BookUtil.BOOK_ONE);
		books.add(BookUtil.BOOK_TWO);
		books.add(BookUtil.BOOK_THREE);
		
		books.add(BookUtil.BOOK_ONE);
		books.add(BookUtil.BOOK_TWO);
		books.add(BookUtil.BOOK_THREE);
		
		books.add(BookUtil.BOOK_FOUR);
		books.add(BookUtil.BOOK_FIVE);
		
		double amount = bookCart.calculateCartPrice(books);
		
		Assert.assertThat(320.0, is(amount));
		
	}
}
