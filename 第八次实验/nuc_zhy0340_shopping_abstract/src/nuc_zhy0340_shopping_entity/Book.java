package nuc_zhy0340_shopping_entity;

public class Book {
	private int bid;
	private String name;
	private String author;
	private float price;
	private int num;
	private Category category;
		
	public Book() {}

	public Book(int bid, String name, String author, float price, int num, Category category) {
		this.bid = bid;
		this.name = name;
		this.author = author;
		this.price = price;
		this.num = num;
		this.category = category;
	}


	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String toString() {
		return "Book [书籍编号=" + bid + ", 名字=" + name + ", 作者=" + author + ", 价格=" + price + ", 数量=" + num
				+ ", 类别=" + category + "]";
	}
	
	
	

}
