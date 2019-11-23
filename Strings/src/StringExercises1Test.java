import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class StringExercises1Test {

   private StringExercises1 se1 = new StringExercises1();
   
   @Test
   public void firstLastSameTest(){
      char r = se1.firstLastSame("abca");
      assertEquals('a',r);
      r = se1.firstLastSame("abcd");
      assertEquals('c',r);
      r = se1.firstLastSame("abcde");
      assertEquals('c',r);
      r = se1.firstLastSame("a");
      assertEquals('a',r);
   }
   
   @Test
   public void swapBeginEndTest(){
      String r = se1.swapBeginEnd("abcd");
      assertEquals("cdab", r);
      r = se1.swapBeginEnd("abcde");
      assertEquals("cdeab",r);
      r = se1.swapBeginEnd("ab");
      assertEquals("ba",r);
   }
   
   @Test
   public void firstLastTest(){
      String r = se1.firstLast("abcd");
      assertEquals("ad",r);
      r = se1.firstLast("g");
      assertEquals("g",r);
      r = se1.firstLast("");
      assertEquals("empty",r);
   }
   
   @Test
   public void startsWithTest(){
      boolean r = se1.startsWith("xyzabc","xyz");
      assertTrue(r);
      r = se1.startsWith("abcdefg1245eglsyaf","abcdefg");
      assertTrue(r);
      r = se1.startsWith("nopenothere","abc");
      assertFalse(r);
      r = se1.startsWith("acbd","abcde");
      assertFalse(r);
      r = se1.startsWith("xyzabc","abc");
      assertFalse(r);
      r = se1.startsWith("","abc");
      assertFalse(r);
      r = se1.startsWith("abcd","");
      assertTrue(r);
   }
   
   @Test
   public void containsTest(){
      boolean r = se1.contains("abcxyzsomething","xyz");
      assertTrue(r);
      r = se1.contains("xyzabc","xyz");
      assertTrue(r);
      r = se1.contains("xyzabc","abc");
      assertTrue(r);
      r = se1.contains("xyzabc","not");
      assertFalse(r);
      r = se1.contains("","something");
      assertFalse(r);
      r = se1.contains("something","");
      assertTrue(r);
   }
   
   @Test
   public void betweenPatternTest(){
      String r = se1.betweenPattern("abc1234abc", "abc");
      assertEquals("1234", r);
      r = se1.betweenPattern("somethingabc1234abcsomethingelse","abc");
      assertEquals("1234", r);
      r = se1.betweenPattern("somethingabcsomethingelse","abc");
      assertEquals("somethingelse", r);
      r = se1.betweenPattern("","abc");
      assertEquals("",r);
      r = se1.betweenPattern("abc","");
      assertEquals("abc",r);
      r = se1.betweenPattern("something","not");
      assertEquals("", r);
   }
   
   @Test
   public void middlePartTest(){
      String r = se1.middlePart("abcxyzabc","abc");
      assertEquals("xyz",r);
      r = se1.middlePart("abcxyzab","abc");
      assertEquals("abcxyzab",r);
      r = se1.middlePart("","ab");
      assertEquals("",r);
      r = se1.middlePart("xyzabc","");
      assertEquals("xyzabc",r);
   }
    
}
