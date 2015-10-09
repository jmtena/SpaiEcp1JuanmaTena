package es.upm.spai.ecp1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C51Test {
	private C51 c51;
	
	@Before
	public void before(){
		c51 = new C51();
	}
	
	@Test
	public void testC51(){
		assertEquals("m1", c51.m1());
		assertEquals("m2", c51.m2());
	}
	
}
