import java.io.*;

public class Complex 
{
 double real,img;
 
 Complex()
 {
	 real=0.0;
	 img=0.0;
	 
 }
 
 Complex(double x, double y)
 {
	 real=x;
	 img=y;
 }
 
 void addition(Complex a,Complex b)
 {

	 
	 real=b.real+a.real;
	 img=b.img+a.img;
	 
	 System.out.print(toString());
	 
	
 }
 
 void multiply(Complex a, Complex b)
 {
	 real=a.real*b.real-a.img*b.img;
	 img=a.real*b.img+b.real*a.img;
	 
	 System.out.print(toString());
 }
 
 public String toString()
 {
	 return String.format(real+"+i"+img);
	 
 }
 
 
 public static void main(String args[])
 {
	 Complex c1=new Complex(4.2,3.2);
	 Complex c2=new Complex(2.2,6.2);
	 Complex c3=new Complex();
	 
	 System.out.print("The addition of the 2 complex nos. is :");
	 c3.addition(c1, c2);
	 System.out.print("The multiplication of the 2 complex nos. is :");
	 c3.multiply(c1, c2);
	 
 }
}
