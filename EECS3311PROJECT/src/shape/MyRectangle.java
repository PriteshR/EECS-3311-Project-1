package shape;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle {

	protected int id; 
	protected int upperX; 
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	
	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */
	public MyRectangle (int id, int upperX, int upperY, int width, int height, Color shapeColor) {
		this.id = id;
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}
		
	/**
	 * Method to draw a rectangle
	 * @param form
	 */
	public  void drawShape(Graphics	form) {
		form.fillRect(upperX, upperY, width, height);
	}
	
    
    //getters
    public Color getColor() {
		return shapeColor;
	}
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
	public int getUpperX() {
		return upperX;
	}
	
	public int getUpperY() {
		return upperY;
	}
	
	//setters
	 public void setColor(Color aShapeColor) {
		 this.shapeColor = aShapeColor;
	 }
	 
	 public void setWidth( int width) {
		 this.width = width;
	 }
	    
	 public void setHeight(int height) {
		 this.height = height;
	 }
	 
	 public void setUpperX(int upperX) {
		 this.upperX = upperX;
	 }
		
	 public void setUpperY(int upperY) {
		 this.upperY = upperY;
	 }
	 
	 public double getArea() {
		 return height*width;
	 }

}
