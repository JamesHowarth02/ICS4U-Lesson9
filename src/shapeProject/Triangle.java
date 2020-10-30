package shapeProject;
import TurtleGraphics.Pen;

/**
 *
 * @author jame1850
 */
public class Triangle extends Shape {
    private double height;
    private double x1, x2, x3;
    private double y1, y2, y3;
    
    public Triangle(double xLoc, double yLoc, double height) {
       xPos = xLoc;
       yPos = yLoc;
       this.x1 = xLoc;
       this.y1 = yLoc;
       this.height = height;
    }
    
    @Override
    public void draw(Pen p) {
        p.up();
        p.move(-x1/2, -y1/2);
        p.down();
        p.move(x1 * 2, y1 * 2);
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stretchBy(double factor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
