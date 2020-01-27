import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TriangleTest {


   @Test
   public void triangleTest1(){
      Triangle t = new Triangle(new Point(2,3), new Point(6,7), new Point(5,3));
      assertEquals(new Point(2,3), t.getA());
      assertEquals(new Point(6,7), t.getB());
      assertEquals(new Point(5,3), t.getC());
      assertEquals(new LineSegment(new Point(2,3), new Point(6,7)), t.getSideC());
      assertEquals(new LineSegment(new Point(6,7), new Point(5,3)),t.getSideA());
      assertEquals(new LineSegment(new Point(2,3), new Point(5,3)), t.getSideB());

      
   }
   
   
   @Test
   public void triangleTest2(){
      Triangle t = new Triangle(new Point(2,3), new Point(6,7), new Point(5,3));
      assertFalse(t.isRight());
      assertTrue(t.isObtuse());
      assertFalse(t.isAcute());
   }
   
   
   @Test
   public void triangleTest3(){
      Triangle t = new Triangle(new Point(2,3), new Point(5, 7), new Point(5,3));
      assertTrue(t.isRight());
      assertFalse(t.isObtuse());
      assertFalse(t.isAcute());
   }
   
   @Test
   public void triangleTest4(){
      LineSegment ls1 = new LineSegment(0,0,0,10);
      LineSegment ls2 = new LineSegment(0,10,5,10);
      Triangle t = new Triangle(ls1,ls2);
      assertEquals(new LineSegment(new Point(0,0), new Point(5,10)), t.getSideC());
   }

}
