/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEx2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author jame1850
 */
public class DrawShapes {

    public static void main(String[] args) {
        Shape x = new Rect(0, 0, 200, 75);
        Shape y = new Circle(50, 50, 100);
        Shape z = new Wheel(-200, 100, 75, 5);
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        p.setColor(Color.red);
        p.setWidth(10);
        x.draw(p);
        p.setColor(Color.green);
        y.draw(p);
        p.setColor(Color.blue);
        z.draw(p);
        Scanner s = new Scanner(System.in);
        System.out.print("Press <enter> to move rectangle to -200, -200");
        
        s.nextLine();
        p.setColor(Color.white);
        x.draw(p);
        x.move(-200, -200);
        p.setColor(Color.red);
        x.draw(p);
        
        System.out.print("Press <enter> to move rectangle to -200, -200 resize the circle by 1/2");
        s.nextLine();
        p.setColor(Color.white);
        y.draw(p);
        y.stretchBy(0.5);
        p.setColor(Color.green);
        y.draw(p);
        
        
        
    }
    
}
