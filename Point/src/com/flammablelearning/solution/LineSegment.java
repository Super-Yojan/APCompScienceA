/**
 * 
 */
package com.flammablelearning.solution;

/**
 * @author yojan A LineSegment is simply defined by its end points (2 Points). A
 *         LineSegment can be created in two ways, by indicating the beginning
 *         and ending points or the x and y components of the beginning and
 *         ending points. Whichever is used by the user, the LineSegment
 *         attributes will be Points. In addition to the accessors and mutators
 *         the LineSegment can be asked for its length. This is simply the
 *         distance from the beginning point to the ending point. i.e.
 *         LineSegment l1 = new LineSegment(2,3,5,3); 
 *         double d = l1.length(); //returns 3.0
 *          Point p1 = new Point(2,3); 
 *         Point p2 = new Point(2,4);
 *         LineSegment l2 = new LineSegment(p1,p2);
 *          double d2 = l2.length();//returns 1.0
 *
 */
public class LineSegment {
	Point p1 = null;
	Point p2 = null;

	public LineSegment(int x1, int y1, int x2, int y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}

	public LineSegment(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getBegin() {
		return p1;
	}

	public Point getEnd() {
		return p2;
	}

	public double length() {
		return p1.distance(p2);
	}
	
	public boolean equals(Object o) {
		LineSegment l = (LineSegment) o;
		return l.getBegin().equals(p1) && l.getEnd().equals(p2);
	}

}
