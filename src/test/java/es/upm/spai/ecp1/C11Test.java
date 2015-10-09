package es.upm.spai.ecp1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C11Test {
	private C11 c11;
	
	@Before
	public void before(){
		c11 = new C11();
	}
	
	@Test
	public void testC11(){
		assertEquals("m1", c11.m1());
		assertEquals("m2", c11.m2());
	}
}
