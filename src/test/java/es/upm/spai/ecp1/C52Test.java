package es.upm.spai.ecp1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C52Test {
	private C52 c52;
	
	@Before
	public void before(){
		c52 = new C52();
	}
	
	@Test
	public void testC52(){
		assertEquals("mA", c52.mA());
	}
}
