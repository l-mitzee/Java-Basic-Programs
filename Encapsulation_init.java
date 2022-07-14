package Encapsulation;

public class Encapsulation_init {
 
	private String shape;
	static int length;
	static int breadth;
	int area;
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public static void main(String[] args) {
		Encapsulation_init obj = new Encapsulation_init();
		obj.length = 23;
		obj.breadth = 12;
		obj.setShape("Square");
		obj.setArea(length*breadth);
		System.out.println("Shape of the figure is: "+obj.getShape());
		System.out.println("length and breadth is: " +obj.length +  " and " +obj.breadth);
		System.out.println("Area of square is: " +obj.getArea());
	}
}
