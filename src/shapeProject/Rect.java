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
public class Rect extends Shape {
    private double width, height;

    public Rect() {
        xPos = 0;
        yPos = 0;
        width = 1;
        height = 1;
    }
    
    public Rect(double x, double y, double w, double h) {
        this.xPos = x;
        this.yPos = y;
        this.width = w;
        this.height = h;
    }

    @Override
    public double perimeter() {
        return this.width * 2 + this.height * 2;
    }
    
    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos); //top left corner
        p.down();
        p.setDirection(0);
        //draw rect
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }
    
    @Override
    public void stretchBy(double factor) {
        this.width = this.width * factor;
        this.height = this.height * factor;
    }
    
     public String toString(){
        String str = "RECTANGLE\n==========\n";
        str += String.format("XPos: %.2f, YPos %.2f\n",xPos, yPos);
        str += String.format("Width: %.2f, Height: %.2f\n", width, height);
        str += String.format("Area %.2f", area());
        return str;
    }
    
}
