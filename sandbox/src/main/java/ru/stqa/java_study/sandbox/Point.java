package ru.stqa.java_study.sandbox;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        double d =((this.x - p2.x)*(this.x - p2.x)) + ((this.y - p2.y)*(this.y - p2.y));
        return Math.sqrt(d);
        //System.out.println(Math.sqrt(d));
    }

}
