package shapeProject;
import TurtleGraphics.Pen;

/**
 *
 * @author jame1850
 */
public class Triangle extends Shape {
    double x1, y1, x2, y2, x3, y3;
    
    public Triangle() {
        x1 = xPos;
        y1 = yPos;
        
        x2 = xPos + 50;
        y2 = yPos + 50;
        
        x3 = x2 + 50;
        y3 = y2 - 50;
    }
    
    @Override
    public double area() {
        return Math.abs(((x1 * y2 - x2 * y1) + (x2 * y3 - x3 * y2) + (x3 * y1 - x1 * y3))/2);
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(x1, y1);
        p.down();
        p.move(x2, y2);
        p.move(x3, y3);
        p.move(x1, y1);
        p.up();
    }

    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stretchBy(double factor) {
        xPos = xPos * factor/2;
        yPos = yPos * factor/2;
        x2 = (x2 - xPos) * factor + xPos;
        y2 = (y2 - yPos) * factor + yPos;
        x3 = (x3 - xPos) * factor + x2;
        y3 = (y3 - yPos) * factor + y2;
    }
    
}
