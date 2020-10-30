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
       this.x2 = this.x1 + height;
       this.y2 = this.y1 + height;
       this.x3 = this.x2 + height;
       this.y3 = this.y2 - height;
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
    public double area() {
        return Math.abs((x1 * y2 - x2 * y1) + (x2 * y3 - x3 * y2) + (x3 * y1 - x1 * y3))/2;
    }
    @Override
    public double perimeter() {
        return Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));
    }
    
    @Override
    public void move(double xLoc, double yLoc) {
       xPos = xLoc;
       yPos = yLoc;
       this.x1 = xLoc;
       this.y1 = yLoc;
       this.x2 = this.x1 + height;
       this.y2 = this.y1 + height;
       this.x3 = this.x2 + height;
       this.y3 = this.y2 - height;
    }

    @Override
    public void stretchBy(double factor) {
        x2 = (x2 - xPos) * factor + xPos;
        x3 = (x3 - xPos) * factor + xPos;
        y2 = (y2 - yPos) * factor + yPos;
        y3 = (y3 - yPos) * factor + yPos;
    }
    
    public String toString(){
        String str = "TRIANGLE\n==========\n";
        str += String.format("XPos: %.2f, YPos %.2f\n",xPos, yPos);
        str += String.format("Width: %.2f, Height: %.2f\n", height, height);
        str += String.format("Area: %.2f\n", area());
        str += String.format("Perimeter: %.2f\n", perimeter());
        return str;
    }

}
