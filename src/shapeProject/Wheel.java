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
public class Wheel extends Circle {
    private int spokes;
    
    public Wheel() {
        super();
        spokes = 3;
    }
    
    public Wheel(double x, double y, double r, int s) {
        super(x, y, r); // super = call parent constructor;
        spokes = s;
    }
    
    public void draw(Pen p) {
        super.draw(p);
        
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(xPos, yPos);
            p.down();
            p.setDirection((i * 360.0) / (spokes));
            p.move(radius);
        }
    }
    
    public void setSpokes(int s) {
        spokes = s;
    }
    
     public String toString(){
        String str = "WHEEL: \n=========\n";
        str += String.format("xPos: %.2f, yPos: %.2f\n", xPos, yPos);
        str += String.format("Radius: %.2f\n", radius);
        str += String.format("Area: %.2f\n", super.area());
        str += String.format("Perimeter: %.2f\n", perimeter());
        str += String.format("Spokes: " + spokes);
        return str;
    }
}
