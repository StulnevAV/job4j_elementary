package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        a.distance(b);
        double expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13to24then1dot41() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 4);
        a.distance(b);
        double expected = 1.41;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when56to87then3dot16() {
        Point a = new Point(5, 6);
        Point b = new Point(8, 7);
        a.distance(b);
        double expected = 3.16;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to111then1dot73() {
        Point c = new Point(0, 0, 0);
        Point d = new Point(1, 1, 1);
        c.distance3d(d);
        double expected = 1.73;
        assertThat(c.distance3d(d)).isEqualTo(expected, withPrecision(0.01));
    }
}