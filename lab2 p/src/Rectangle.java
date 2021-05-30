public class Rectangle {
	private float length;
	private float width;
	public Rectangle() {
	this.length = 1;
	this.width = 1;
	}
	public Rectangle(float length,float width) {
		this.setLength(length);
		this.setWidth(width);
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if (inRange(length)) {
			this.length = length;
		}
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		if (inRange(width)) {
			this.width = width;
		}
	}
	private boolean inRange(float value) {
		if (value > 0 && value <= 20) {
			return true;
		} else {
			System.out.println("Please enter value in range 1-20");
			return false;
		}
	}
	public float getPerimeter() {
		float perimeter = 2 * (this.length + this.width);
		return perimeter;
	}
	public float getArea() {
		float area = this.length * this.width;
		return area;
	}
}

