package nuc.sw.shopping.db;

import nuc_zhy0340_shopping_entity.Book;
import nuc_zhy0340_shopping_entity.Category;

public class BookDataSet {
	private Book[] books;
	final int DateBaseSize = 100; //该数据库总量大小
	
	public BookDataSet() {
		books = new Book[DateBaseSize];
	}
	
	
}
