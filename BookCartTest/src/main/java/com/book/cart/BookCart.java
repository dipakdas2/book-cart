package com.book.cart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BookCart {

	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private final double DIS_05 = 0.95;
        private final double DIS_10 = 0.90;
        private final double DIS_20 = 0.80;
        private final double DIS_25 = 0.75;
        private final double ONE = 50.0;

	 double calculateCartPrice(List<String> books) {
	        Map<String, List<String>> booksMap = books.stream().collect(Collectors.groupingBy(Function.identity(), 
	        		TreeMap::new, Collectors.toList()));
	        LOGGER.log(Level.INFO, "booksMap : "+ booksMap);
	        List<String> initialBookList = new ArrayList<>(books);
	        booksMap.keySet().forEach(n -> initialBookList.remove(n));
	        
	        double ret = 0.0;
	        switch (booksMap.size()) {
	            case 0:
	                return 0.0;
	            case 1:
	                ret = ONE;
	                break;
	            case 2:
	                ret = ONE * 2.0 * DIS_05;
	                break;
	            case 3:
	                ret = ONE * 3.0 * DIS_10;
	                break;
	            case 4:
	                ret = ONE * 4.0 * DIS_20; 
	                break;
	            case 5: 
	                Iterator<String> bookItr = books.iterator();
	                String extr = null;
	                while (bookItr.hasNext() && (booksMap.get((extr = bookItr.next())).size() != 1));
	                if (extr != null) {
	                    booksMap.remove(extr);
	                    List<String> booksList = new ArrayList<>(books);
	                    booksMap.keySet().forEach(n -> booksList.remove(n));
	                    return Math.min(ONE * 5.0 * DIS_25 + calculateCartPrice(initialBookList), ONE * 4.0 * DIS_20 + calculateCartPrice(booksList));
	                }
	                ret = ONE * 5.0 * DIS_25;
	                
	        }
	        return ret + calculateCartPrice(initialBookList);
	    }
}

