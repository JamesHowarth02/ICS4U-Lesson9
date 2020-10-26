/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import shapeProject.Circle;
import shapeProject.Rect;
import shapeProject.Shape;
import shapeProject.Wheel;

/**
 *
 * @author jame1850
 */
public class ShapeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        
        // Shape s = new Shape(); --> Not allowed.
        Shape a = new Wheel();
        Shape b = new Rect();
        
        Circle c = new Wheel(); // --> Parent can be a child.
        
        // Wheel w = new Circle(); 
        // Wheels are circles but circles are not wheels.
    }
    
}
