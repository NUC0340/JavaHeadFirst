package nuc.sw.shopping.dao;

import nuc_zhy0340_shopping_entity.Book;

public interface IBookDao {
	public void insertBook();
	
	public Book[] quertBooks();
	
	public Book queryBookById(int bid);
	
	public Book queryBookByName(String name);
	
	public Book queryBookByAuthor(String author);
	
	public Book queryBookByPrice(int price);
	
	public void modifyBook();

}	
