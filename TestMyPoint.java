public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 0);
		System.out.println("Original coordinates for p1: " + p1);
		p1.setXY(5,6);
		System.out.println("New coordinates for p1 using setXY: " + p1);
	}
}

