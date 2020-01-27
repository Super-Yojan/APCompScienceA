package com.flammablelearning.solution;

/*A Point is simply an x and a y value. You can make these ints, it has the appropriate accessors and mutators. It also has the ability to find the distance
	from itself to another point. i.e
	Point p1 = new Point(2,3);
	Point p2 = new Point(2,4);
	double d = p1.distance(p2);  //returns 1.0
*/

public class Point {
	
	int x = 0; 
	int y = 0;
	
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance(Point p) {
		//((x1 - x2)^2 + (y1-y2)^2)^(1/2)
		double distance = Math.sqrt(Math.pow((x - p.getX()),2 )+ Math.pow((y- p.getY()), 2));
		return distance;
	}
	
	public boolean equals(Object o) {
		Point p = (Point) o;
		return p.getX() == x && p.getY() == y;
	}
	
	public String toString() {
		return "(" +x +"," + y+")";
	}
	

}
