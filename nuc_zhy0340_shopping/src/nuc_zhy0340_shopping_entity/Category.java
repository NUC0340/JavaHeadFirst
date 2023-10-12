package nuc_zhy0340_shopping_entity;

public class Category {
	private int id;
	private String firstlevel;
	private String secondlevel;
	
	
	public Category() {
		super();
	}

	public Category(int id) {
		super();
		this.id = id;
	}

	public Category(int id, String firstlevel, String secondlevel) {
		super();
		this.id = id;
		this.firstlevel = firstlevel;
		this.secondlevel = secondlevel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstlevel() {
		return firstlevel;
	}

	public void setFirstlevel(String firstlevel) {
		this.firstlevel = firstlevel;
	}

	public String getSecondlevel() {
		return secondlevel;
	}

	public void setSecondlevel(String secondlevel) {
		this.secondlevel = secondlevel;
	}

	public String toString() {
		return firstlevel + " > " + secondlevel ;
	}
}
