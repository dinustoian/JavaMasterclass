package Exercises.Section7;

public class Point {

    private int x;
    private int y;

    // Constructors
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    // y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // double
    public double distance(){
        return (this.distance(0, 0));

    }

    public double distance (Point other) {
        return this.distance(other.x, other.y);
    }

    public double distance(int x, int y){
        int dx = x - this.x;
        int dy = y - this.y;
        return Math.sqrt((dx*dx) + (dy * dy));

    }

}
