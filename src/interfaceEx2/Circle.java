/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEx2;
import TurtleGraphics.Pen;

/**
 *
 * @author jame1850
 */
public class Circle implements Shape{

    protected double xPos, yPos, radius; // subclasses have access
    
    public Circle() {
        xPos = 0;
        yPos = 0;
        radius = 0;
    }
    
    public Circle(double xPos, double yPos, double radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = (Math.PI * 2 * radius) / 120.0;
        //120-sided shape
      
        p.up();
        p.move(xPos,yPos);
        
        //go to edge
        p.setDirection(0);
        p.move(radius);
        p.setDirection(90);
        p.down();
        
        for (int i = 0; i <= 130; i++) {
            p.move(side);
            p.turn(3); // 120 * 3 = 360
        }
    }

    @Override
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }
    
    @Override
    public void move(double xLoc, double yLoc) {
        this.xPos = xLoc;
        this.yPos = yLoc;
    }

    @Override
    public void stretchBy(double factor) {
        radius = radius * factor;
    }
    
    @Override
    public String toString(){
        String str = "CIRCLE\n======\n";
        str += String.format("xPos: %.2f, yPos %.2f\n",xPos, yPos);
        str += String.format("Radius: %.2f\n", radius);
        str += String.format("Area %.2f", area());
        return str;
    }
    
}
