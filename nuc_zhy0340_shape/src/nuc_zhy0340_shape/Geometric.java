package nuc_zhy0340_shape;

import java.util.Date;

public class Geometric {
    protected String color;
    protected boolean filled;
    protected Date dateSet = new Date();

    public Geometric() {
		super();
	}

	public Geometric(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}



	public Geometric(String color, boolean filled, Date dateSet) {
		super();
		this.color = color;
		this.filled = filled;
		this.dateSet = dateSet;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateSet() {
		return dateSet;
	}

	public void setDateSet(Date dateSet) {
		this.dateSet = dateSet;
	}

	public String toString() {
		return "Geometric [color=" + color + ", filled=" + filled + "]";
	}
    

}
