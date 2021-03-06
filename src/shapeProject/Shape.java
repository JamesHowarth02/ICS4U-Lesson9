/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;

import TurtleGraphics.Pen;

/**
 *
 * @author jame1850
 */
abstract public class Shape { // cant make direct objects from shape class.

    protected double xPos, yPos;

    public Shape() {
        xPos = 0;
        yPos = 0;
    }

    public Shape(double xPosN, double yPosN) {
        xPos = xPosN;
        yPos = yPosN;
    }

    // all shapes have area but its different for each
    // must declare and make each method abstract
    abstract public double area();
    abstract public void draw(Pen p);
    abstract public double perimeter();

    // these methods are identical in all shapes, therefore we can provide code here.
    
    final public double getXPos() {
        return xPos;
    }

    final public double getYPos() {
        return yPos;
    }
    
    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    abstract public void stretchBy(double factor);
}
