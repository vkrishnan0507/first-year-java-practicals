package p1;

public abstract class Shape 
{
	public String id;
    public Shape (String id)
    {this.id = id;}

    
    public abstract double getArea();

    public String getId()
    {return id;}
    
    public String toString( )
    {return "Shape[id="+id+",area="+getArea()+"]";}

    
  }