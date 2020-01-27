package com.flammablelearning.solution;

import static org.junit.Assert.*;

import org.junit.Test;


public class LineSegmentTest {

   @Test
   public void segmentTest1(){
      LineSegment seg = new LineSegment(2,3,2,4);
      assertEquals(seg.getBegin(), new Point(2,3));
      assertEquals(seg.getEnd(), new Point(2,4));
      
   }
   
   @Test
   public void segmentTest2(){
      LineSegment seg = new LineSegment(new Point(2,3), new Point(2,4));
         assertEquals(seg.getBegin(), new Point(2,3));
      assertEquals(seg.getEnd(), new Point(2,4));

   }
   
   @Test
   public void segmentTest3(){
      LineSegment seg = new LineSegment(2,3,2,4);
      assertEquals(1, seg.length(), .01);   
   
   }

}
