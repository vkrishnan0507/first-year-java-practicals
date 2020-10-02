package p2;
import p1.*;

public class Circle extends Shape {

	private double radius;
    public Circle (String name, double r)
    { 
      super(name);
      radius = r;
    }
    
    
    public double getArea()
    {return Math.PI * radius * radius;}
    
    public double getRadius()
    {return radius;}
    
    public void setRadius(double newRadius)
    {radius = newRadius;}
    
    public String toString( )
    {
    	return "Circle[radius="+radius+","+super.toString()+"]";
    }

    
  }