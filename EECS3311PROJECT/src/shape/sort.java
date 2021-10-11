package shape;

import java.awt.Color;

public class sort {
	int x;
	int y;
	int r;
	int l;
	int b;
	double area;
	boolean circle;
	Color c;


	public sort(int x, int y, int r, int l, int b, double area, boolean circle, Color c) {
	   this.x = x;
	   this.y = y;
	   this.r = r;
	   this.l = l;
	   this.b = b;
	   this.area = area;
	   this.circle = circle;
	   this.c = c;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getr() {
		return r;
	}
	public int getl() {
		return l;
	}
	public int getb() {
		return b;
	}
	
	public Color getColor() {
		return c;
	}
	
	public double getArea() {
		return area;
	}
	public boolean isItCircle() {
		return circle;
	}
}