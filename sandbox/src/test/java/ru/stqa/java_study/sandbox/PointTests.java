package ru.stqa.java_study.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {
        Point p1 = new Point(5,6);
        Point p2 = new Point(8,2);

        Assert.assertEquals(p1.distance(p2), 5.0); ;
    }

    @Test
    public void testDistance2() {
        Point p1 = new Point(5,6);
        Point p2 = new Point(8,2);

        Assert.assertNotEquals(p1.distance(p2), 25.0); ;
    }
}
