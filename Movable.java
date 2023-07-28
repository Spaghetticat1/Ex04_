package com.qa.Movable.Movable;

import qa.Point;

public interface Movable {
    public Point getCurrentLocation();
    public void move(double x, double y);
}
