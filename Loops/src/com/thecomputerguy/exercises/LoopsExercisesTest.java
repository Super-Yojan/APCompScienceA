package com.thecomputerguy.exercises;


import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class LoopsExercisesTest {
   LoopsExercises le = new LoopsExercises();
   
   @Test
   public void sumBetweenTest(){
      int result = le.sumBetween(1,10);
      assertEquals(55, result);
      result = le.sumBetween(20, 25);
      assertEquals(135, result);
      result = le.sumBetween(35,25);
      assertEquals(0,result);
      result = le.sumBetween(56, 56);
      assertEquals(56, result);
   }
   
   @Test
   public void sumDigitsTest(){
      int result = le.sumDigits(1234);
      assertEquals(10, result);
      result = le.sumDigits(87654);
      assertEquals(30, result);
      result = le.sumDigits(900001);
      assertEquals(10, result);
      result = le.sumDigits(0);
      assertEquals(0, result);
      result = le.sumDigits(-1234);
      assertEquals(-10, result);
   }
   
   @Test
   public void palindromeTest(){
      boolean b = le.palindrome("racecar");
      assertTrue(b);
      b = le.palindrome("not here");
      assertFalse(b);
      b = le.palindrome("not a ton");
      assertTrue(b);
      b = le.palindrome("");
      assertTrue(b);
      b = le.palindrome("Sos");
      assertFalse(b);
   }
   
   @Test
   public void factorialTest(){
      long result = le.factorial(5);
      assertEquals(120, result);
      result = le.factorial(7);
      assertEquals(5040, result);
      result = le.factorial(2);
      assertEquals(2, result);
      result = le.factorial(0);
      assertEquals(1, result);
   }
   
   @Test
   public void pairsTest(){
      int result = le.pairs("bobby");
      assertEquals(1, result);
      result = le.pairs("12345");
      assertEquals(0, result);
      result = le.pairs("mississippi");
      assertEquals(3, result);
      result = le.pairs("aabbbc");
      assertEquals(6, result);
      result = le.pairs("aaaaabb");
      assertEquals(13, result);
   }
   
   @Test
   public void countTest(){
      int result = le.count(1234,2);
      assertEquals(1, result);
      result = le.count(22334562,2);
      assertEquals(4, result);
      result = le.count(4544324,3);
      assertEquals(1,result);
      result = le.count(4544324,4);
      assertEquals(5,result);
      result = le.count(0,9);
      assertEquals(0, result);
      result = le.count(-2324282,2); //this one is tricky.....
      assertEquals(4, result);
   }
   
   @Test
   public void gcdTest(){
      int result = le.gcd(12, 16);
      assertEquals(4, result);
      result = le.gcd(16, 12);
      assertEquals(4, result);
      result = le.gcd(13,11);
      assertEquals(1, result);
      result = le.gcd(25,5);
      assertEquals(5, result);
      result = le.gcd(6, 48);
      assertEquals(6, result);
   }
   
   @Test
   public void isPrimeTest(){
      boolean b = le.isPrime(100);
      assertFalse(b);
      b = le.isPrime(97);
      assertTrue(b);
      b = le.isPrime(36);
      assertFalse(b);
      b = le.isPrime(2);
      assertTrue(b);
   }
   
   @Test
   public void primeTest(){
      int result = le.prime(100);
      assertEquals(97, result);
      result = le.prime(37);
      assertEquals(37, result);
      result = le.prime(0);
      assertEquals(0, result);
   }
   
}
