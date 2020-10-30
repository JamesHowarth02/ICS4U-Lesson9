/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEx2;

import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import TurtleGraphics.SketchPadWindow;
import java.awt.Color;


/**
 *
 * @author jame1850
 */
public class DrawShapes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen pen = new StandardPen(new SketchPadWindow(1000, 800));
        Shape shapes[] = new Shape[20];
        for (int i = 0; i < 20; i++) {
            shapes[i] = getRandomShape();
            pen.setColor(getRandomColor());
            shapes[i].draw(pen);
            System.out.println(shapes[i]);
        }
    }
    
    public static Color getRandomColor() {
        int rr, rg, rb;
        rr = (int)(Math.random() * 256);
        rg = (int)(Math.random() * 256);
        rb = (int)(Math.random() * 256);
        
        return new Color(rr, rg, rb);
    }
    
    public static Shape getRandomShape() {
        Shape s;
        int rx, ry, rr, rw, rh, randshp, rs;
        rx = (int)(Math.random() * 600 - 300);
        ry = (int)(Math.random() * 600 - 300);
        rr = (int)(Math.random() * 100 + 10);
        rw = (int)(Math.random() * 250 + 10);
        rh = (int)(Math.random() * 250 + 10);
        randshp = (int)(Math.random() * 3 + 1);
        rs = (int)(Math.random() * 12 + 3);
        if(randshp == 1) 
            return new Rect(rx, ry, ry, rh);
        if(randshp == 2) 
            return new Circle(rx, ry, rr);
        if(randshp == 3) 
            return new Wheel(rx, ry, rr, rs);
        
        return null;
    }
    
}
