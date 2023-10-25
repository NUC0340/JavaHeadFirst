package nuc_zhy0340_shape;

public class Circle extends Geometric{
	private float radius;
	
	public Circle (float radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float getArea() {
		return 3.14f * radius * radius;
	}
	
	public float getPerimeter () {
		return 2 * 3.14f * radius;
	}
	
	public float getDiameter () {
		return 2 * radius;
	}

	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + ", 创建时间是：" + getDateSet()
				+ ",圆的面积是：" + getArea() + ", 圆的周长是：" + getPerimeter() + ", 圆的直径是：" + getDiameter()
				+ "]";
	}
	
	
}
