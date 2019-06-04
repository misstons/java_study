package ru.stqa.java_study.sandbox;

public class DistancePoint2 {
    public static void main(String[] args) {

        Point p1 = new Point(5, 6);
        Point p2 = new Point(10, 15);
        System.out.println("Расстояние между точками = " + distance(p1, p2));

    }
        public static double distance(Point p1, Point p2) {
            double d =((p1.x - p2.x)*(p1.x - p2.x)) + ((p1.y - p2.y)*(p1.y - p2.y));
            return Math.sqrt(d);
            //System.out.println(Math.sqrt(d));
    }
}
