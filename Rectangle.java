/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */

public class Rectangle extends Shape{ 

	private double width;
	private double length;
	
	public Rectangle(){
	    this.width = 1.0;
	    this.length = 1.0;
	    
	}
	
	public Rectangle(double width, double length){
	    this.width= width;
	    this.length= length;

	    
	}
	
	public Rectangle (double width, double length, String color, boolean filled){
	    
	    this.width= width;
	    this.length= length;
		super.setColor(color);
		super.setFilled(filled);
	    
	}
	
	public double getWidth(){
	    return this.width;
	    
	    
	}
	
	public void setWidth(double width){
	    this.width = width;
	    
	    
	}

	public double getLength(){
	    return this.length;
	    
	    
	}
	
	public void setLength(double length){
	    this.length = length;
	    
	    
	}
	
	public double getArea(){
		return length * width;
	    
	}
	
	public double getPerimeter(){
	    return 2 * (length + width);
	    
	}

	@Override
	public String toString(){
	    
	    return "A Rectangle with width = "+ width +"and length = "+length+", which is a subclass of"+super.toString();
	   
	}
	
}