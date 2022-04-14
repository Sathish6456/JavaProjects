
public class Rectangle {	
	private int width;
	private int height;
	
	
	
	Rectangle() {
		
	}

	Rectangle(int width, int height) {
	
		this.width = width;
		this.height = height;
	}
	
	int getWidth() {
		return width;
	}
	void setWidth(int width) {
		this.width = width;
	}
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		this.height = height;
	}
	
	long getArea() {
		
		return this.width*this.height;
	}
}
