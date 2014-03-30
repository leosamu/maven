package org.upv.ufasu;

import junit.framework.TestCase;

import org.upv.ufasu.weather.TempConversor;

public class TempConversorTest extends TestCase {
	public void testParser() throws Exception {
		assertEquals( "10", TempConversor.getCelsius("50") );		
		}
}
