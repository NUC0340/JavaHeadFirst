package nuc_zhy0340_shape;

public class Rectangle extends Geometric{
	private float length;
	private float width;
	
	public Rectangle (float length, float width, String color, boolean filled)  {
		super(color, filled);
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getArea () {
		return length*width;
	}
	
	public float getPerimeter () {
		return 2 * (length + width);
	}

	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + ", filled=" + filled
				+ ", 创建时间是：" + getDateSet() + ", 长方形的面积是：" + getArea() + ", 长方形的周长是：" + getPerimeter() + "]";
	}
	
	
}
