public class TestMyLine {
	public static void main(String[] args) {
		MyPoint point1 = new MyPoint(1, 2);
		MyPoint point2 = new MyPoint(4, 6);
		MyLine line = new MyLine(point1, point2);

		System.out.println("Line: " + line);
		System.out.println("Length: " + line.getLength());
	}
}

