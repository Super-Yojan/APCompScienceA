package com.flammablelearning.solution;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class PointTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   
   @Test
   public void pointTest1(){
      Point p = new Point(2,3);
      assertEquals(2, p.getX());
      assertEquals(3, p.getY());
   }
   
   
   @Test
   public void pointTest2(){
      Point p = new Point();
      assertEquals(0,p.getX());
      assertEquals(0,p.getY());
   }
   
   @Test
   public void pointTest3(){
      Point p = new Point(1,2);
      Point p2 = new Point(1,5);
      double d = p.distance(p2);
      assertEquals(3.0, d, .01);
   }
   
   @Test
   public void pointTest4(){
      Point p = new Point(4,4);
      Point p2 = new Point(9,9);
      double d = p.distance(p2);
      assertEquals(7.07,d,.01);
   }
   
   @Test
   public void pointTest5(){
      Point p = new Point(5,8);
      Point p2 = new Point(5, 8);
      assertTrue(p.equals(p2));
   }    
}
