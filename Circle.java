/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Circle extends Shape{ 
{
	private double radius;
	
	public Circle(){
	    this.radius = 1.0;
	    
	}
	
	public Circle (double radius){
	    this.radius = radius;
	    
	}
	
	public Circle (double radius, String color, boolean filled){
	    
	    this.radius = radius;
	    
	}
	
	public double getRadius(){
	    return this.radius;
	    
	    
	}
	
	public void setRadius(double radius){
	    this.radius = radius;
	    
	    
	}
	
	public double getArea(){
	    
	    return Math.PI * radius * radius;
	    
	}
	
	public double getPerimeter(){
	    return 2 * Math.PI * radius;
	    
	}
	@Override
	public String toString(){
	    
	     return "A Circle with radius=" + radius +" which is a subclass of"+super.toString();
	    
	}
	
}
