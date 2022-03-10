package day11;

public class sagak extends Figure {
	private int width;
	private int height;
	
	public sagak() {};
	
	public sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setArea() {	// 오버라이딩
		area = width * height;
	}
}
