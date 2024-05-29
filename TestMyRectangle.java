public class TestMyRectangle {
	public static void main(String[] args) {
		MyPoint topLeft = new MyPoint(1, 5);
		MyPoint bottomRight = new MyPoint(6, 2);
		MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);
	
		System.out.println("Rectangle width: " + rectangle.getWidth());
		System.out.println("Rectangle height: " + rectangle.getHeight());
		System.out.println("Rectangle area: " + rectangle.getArea());
	}
}
