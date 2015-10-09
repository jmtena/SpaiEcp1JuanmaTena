package es.upm.spai.ecp1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
	private C31 c31;
	
	@Before
	public void before(){
		c31 = new C31();
	}
	
	@Test
	public void testC31(){
		assertEquals("m1", c31.m1());
		assertEquals("m2", c31.m2());
	}
}
