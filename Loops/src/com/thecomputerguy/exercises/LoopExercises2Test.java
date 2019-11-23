package com.thecomputerguy.exercises;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class LoopExercises2Test {

   @Test
   public void reverseNumTest(){
      int result = LoopExercises2.reverseNum(12345);
      assertEquals(54321, result);
      result = LoopExercises2.reverseNum(1000);
      assertEquals(1, result);
      result = LoopExercises2.reverseNum(0);
      assertEquals(0, result);
      result = LoopExercises2.reverseNum(1100003);
      assertEquals(3000011, result);
   }
   
   @Test
   public void lengthTest(){
      int result = LoopExercises2.length(12345);
      assertEquals(5, result);
      result = LoopExercises2.length(10);
      assertEquals(2, result);
      result = LoopExercises2.length(0);
      assertEquals(1, result);
   }
   
   @Test
   public void countNumbersTest(){
      int result = LoopExercises2.countNumbers(11022011, 1);
      assertEquals(4, result);
      result = LoopExercises2.countNumbers(11022011, 11);
      assertEquals(2, result);
      result = LoopExercises2.countNumbers(343434304, 34);
      assertEquals(3, result);
      result = LoopExercises2.countNumbers(123456, 89);
      assertEquals(0, result);
      result = LoopExercises2.countNumbers(0,0);
      assertEquals(1,result);
      result = LoopExercises2.countNumbers(5678, 5678);
      assertEquals(1,result);
   }
   
   @Test
   public void countWordsTest(){
      int result = LoopExercises2.countWords("I love CS");
      assertEquals(3,result);
      result = LoopExercises2.countWords("   I love CS");
      assertEquals(3, result);
      result = LoopExercises2.countWords("I     love       CS");
      assertEquals(3, result);
      result = LoopExercises2.countWords("IloveCS");
      assertEquals(1, result);
      result = LoopExercises2.countWords("");
      assertEquals(0,result);
      result = LoopExercises2.countWords("      ");
      assertEquals(0,result);
      result = LoopExercises2.countWords("This   is a really long sentence with     varying amounts of space in it   ");
      assertEquals(13, result);
      
   }

}
