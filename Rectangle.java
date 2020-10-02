package p3;
import p1.*;
public class Rectangle extends Shape 
{	
	private double width, height;
    public Rectangle (String name, double w, double h)
    { 
      super(name);
      width  = w;
      height = h;
    }
    
    
    public double getArea()
    {return width*height;}
    
    public double getWidth()
    {return width;}
    
    public double getHeight()
    {return height;}
    
    public void setWidthHeight(double newWidth, double newHeight)
    {
      width  = newWidth;
      height = newHeight;
    }
    
    public String toString( )
    {
    	return "Rectangle[width="+width+",height="+height+","+super.toString()+"]";
    }

    
  }
