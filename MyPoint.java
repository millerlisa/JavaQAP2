public class MyPoint {
    private int x;
    private int y;
	// No-arugment constructor
    public MyPoint() {
        this.x = 0;
		this.y = 0;
    }
	// Constructor with specified x and y (parameterized constructor)
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
	// Setter and getter methods
	public void setX(int x) {
		this.x = x;
	}
    public int getX() {
        return x;
    }
	public void setY(int y) {
		this.y = y;
	}
    public double getY() {
        return y;
    }
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));
    }
    public double distance(int x, int y) {
        return distance(new MyPoint(x, y));
    }
}
