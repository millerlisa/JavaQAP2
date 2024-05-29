public class MyRectangle {
    private MyPoint topLeft;     // Top-left corner
    private MyPoint bottomRight; // Bottom-right corner

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Calculate the width of the rectangle
    public double getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Calculate the height of the rectangle
    public double getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Calculate the area of the rectangle
    public double getArea() {
        return getWidth() * getHeight();
    }
}
