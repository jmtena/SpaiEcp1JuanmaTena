package es.upm.spai.ecp1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C21Test {
	private C21 c21;
	
	@Before
	public void before(){
		c21 = new C21();
	}
	
	@Test
	public void testC21(){
		assertEquals("m1", c21.m1());
		assertEquals("m2", c21.m2());
	}
}
