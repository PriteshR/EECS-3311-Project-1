package shape;

import java.awt.Color;
import java.awt.Graphics;

public class MyCircle{

	protected int id;
	protected int upperX; 
	protected int upperY;
	protected int radius;
	protected Color shapeColor;
	
	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param radius
	 * @param shapeColor
	 */
	public MyCircle (int id, int upperX, int upperY, int radius, Color shapeColor) {
		this.id = id;
		this.upperX = upperX;
		this.upperY = upperY;
		this.radius = radius;
		this.shapeColor = shapeColor;
	}
	
	/**
	 * Method to draw a rectangle
	 * @param form
	 */
	public  void drawShape(Graphics	form) {
		form.fillOval(upperX, upperY, radius*2, radius*2);
	}
	
    
    //getters
    public Color getColor() {
		return shapeColor;
	}
    
    public int getRadius() {
    	return radius;
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
	 
	public void setRadius( int r) {
		this.radius = r;
	}
	 
	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}
		
	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}

	public double getArea() {
		return ((double) (3.17*(radius*radius)));
	}
}
