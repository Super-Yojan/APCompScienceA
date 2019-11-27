package com.FlamableLearning;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class StringPracticeTest {

	StringPractice sp = new StringPractice();

	
	@Test
	public void mysteryTest() {
		String s = sp.mystery("bobhead");
		Assert.assertEquals(s,"boead");
		s = sp.mystery("bob");
		Assert.assertEquals(s, "bobob");
		
	}
	
	@Test
	public void mystery1Test() {
		String s = sp.mystery1("abcdefgh");
		Assert.assertEquals(s, "aceg");
		s = sp.mystery1("    ");
		Assert.assertEquals(s, "  ");
	}
	
	@Test
	public void mystery2Test() {
		String s = sp.mystery2("HelloxyzWorld", "xyz");
		Assert.assertEquals(s, "Hello123World");
	}
	
	@Test
	public void myster3Test() {
		String s = sp.mystery3("abc123xyz567");
		Assert.assertEquals(s, "abcone23xyzfive67");
	}

}
