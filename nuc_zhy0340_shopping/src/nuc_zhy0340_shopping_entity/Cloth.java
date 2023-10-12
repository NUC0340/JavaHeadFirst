package nuc_zhy0340_shopping_entity;

import nuc_zhy0340_shopping_entity.*;

public class Cloth {
    private int cid;
    private String name;
    private String size;
    private int price;
    private Category category;
    
    public Cloth() {
    	super();
    }

	public Cloth(int cid) {
		super();
		this.cid = cid;
	}

	public Cloth(int cid, String name, String size, int price, Category category) {
		super();
		this.cid = cid;
		this.name = name;
		this.size = size;
		this.price = price;
		this.category = category;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String toString() {
		return "Cloth [cid=" + cid + ", name=" + name + ", size=" + size + ", price=" + price + ", category=" + category
				+ "]";
	}
    
    
}

