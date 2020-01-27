/**
 * 
 */
package com.flammablelearning.solution;

/**
 * @author yojan A Triangle is made of three LineSegments. It can be created
 *         using 3 Points or 2 LineSegments. You may assume that the first
 *         segment is a , the second is b and the calculated one is c. The
 *         Triangle must hold 3 LineSegments. You will NOT be holding onto
 *         points. It also has accessors getA, getB, and getC. There are no
 *         mutators for these attributes. The triangle has 3 methods. isAcute
 *         (), isObtuse ), and isRight (. Triangle t = new Triangle(new
 *         Point(2,3), new Point(6,7), new Point(5,3)); //Way one of creating
 *         the triangle LineSegment ls1 = new LineSegment(2,3,6,7); LineSegment
 *         ls2 = new LineSegment(6,7,5,3); Triangle t2 = new Triangle(ls1,ls2);
 *         // way 2 to create triangle t1.equals(t2); // returns true
 *
 */
public class Triangle {

	// Three points of a triangle
	Point a;
	Point b;
	Point c;

	// Three line segments of a triangle
	LineSegment la;
	LineSegment lb;
	LineSegment lc;

	// Constructor that takes Points
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
		la = new LineSegment(b, c);
		lb = new LineSegment(a, c);
		lc = new LineSegment(a, b);
	}

	// Constructor that takes LineSegments
	public Triangle(LineSegment la, LineSegment lb) {
		this.la = la;
		this.lb = lb;
		this.lc = new LineSegment(la.getBegin(), lb.getEnd());
	}

	/**
	 * @return the a
	 */
	public Point getA() {
		return a;
	}

	/**
	 * @return the b
	 */
	public Point getB() {
		return b;
	}

	/**
	 * @return the c
	 */
	public Point getC() {
		return c;
	}

	public LineSegment getSideA() {
		return la;
	}

	public LineSegment getSideB() {
		return lb;
	}

	public LineSegment getSideC() {
		return lc;
	}

	public boolean isAcute() {
		if ((Math.pow(la.length(), 2) + Math.pow(lb.length(), 2)) > Math.pow(lc.length(), 2)) {
			return true;
		}
		return false;
	}

	public boolean isObtuse() {
		return (Math.pow(la.length(), 2) + Math.pow(lb.length(), 2)) < Math.pow(lc.length(), 2);
	}

	public boolean isRight() {
		return (Math.pow(la.length(), 2) + Math.pow(lb.length(), 2)) == Math.pow(lc.length(), 2);
	}

	public boolean equals(Object o) {
		Triangle t = (Triangle) o;

		return t.getA().equals(a) && t.getB().equals(b) && t.getC().equals(c) && t.getSideA() == la
				&& t.getSideB() == lb && t.getSideC() == lc;
	}
}
