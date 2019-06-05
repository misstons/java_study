package ru.stqa.java_study.sandbox;

public class DistancePoint2 {
    public static void main(String[] args) {

        Point p1 = new Point(5, 6);
        Point p2 = new Point(10, 15);
        System.out.println("Расстояние между точками = " + p1.distance(p2));

    }

}