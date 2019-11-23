import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class StringWithLoopsTest {


   
   private StringWithLoops swl = new StringWithLoops();
   
   @Test
   public void countPatternTest(){
      int res = swl.countPattern("bbobb","b");
      assertEquals(4,res);
      res = swl.countPattern("abcxyzabc","abc");
      assertEquals(2,res);
      res = swl.countPattern("bacxyzabc","xyz");
      assertEquals(1,res);
      res = swl.countPattern("abcxyzmpn","mon");
      assertEquals(0,res);
      res = swl.countPattern("","abc");
      assertEquals(0,res);
      res = swl.countPattern("abcefg","");
      assertEquals(0,res);
      res = swl.countPattern("short","notsoshort");
      assertEquals(0, res);
   }
   
   @Test
   public void reverseStringTest(){
      String rev = swl.reverseString("abcde");
      assertEquals("edcba", rev);
      rev = swl.reverseString("farmer");
      assertEquals("remraf", rev);
      rev = swl.reverseString("");
      assertEquals("",rev);
      rev = swl.reverseString("b");
      assertEquals("b",rev);
   }
   
   @Test
   public void starringTest(){
      String star = swl.starring("farmer");
      assertEquals("f*a*r*m*e*r",star);
      star = swl.starring("bb");
      assertEquals("b*b",star);
      star = swl.starring("b");
      assertEquals("b",star);
      star = swl.starring("");
      assertEquals("",star);
   }
   
   @Test
   public void moneySsTest(){
      String res = swl.moneySs("mississippi");
      assertEquals("mi$$i$$ippi", res);
      res = swl.moneySs("sisters");
      assertEquals("$i$ter$", res);
      res = swl.moneySs("nothing");
      assertEquals("nothing",res);
      res = swl.moneySs("");
      assertEquals("", res);
   }
   
   @Test
   public void swappyTest(){
      String res = swl.swappy("abcdef");
      assertEquals("badcfe", res);
      res = swl.swappy("abcde");
      assertEquals("badce", res);
      res = swl.swappy("ab");
      assertEquals("ba", res);
      res = swl.swappy("");
      assertEquals("",res);
   }
}
