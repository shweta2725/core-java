package com.sunbeam.geometry;

public class Point2D {

    private int x;
    private int y;

    // Parameterized Constructor
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to return details
    public String getDetails() {
        return "Point : (" + x + ", " + y + ")";
    }

    // isEqual method
    public boolean isEqual(Point2D anotherPoint) {
        return this.x == anotherPoint.x && this.y == anotherPoint.y;
    }

    // calculateDistance method
    public double calculateDistance(Point2D anotherPoint) {
        return Math.sqrt(
                Math.pow(this.x - anotherPoint.x, 2) +
                Math.pow(this.y - anotherPoint.y, 2)
        );
    }
}