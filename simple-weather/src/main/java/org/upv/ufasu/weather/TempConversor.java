package org.upv.ufasu.weather;

public class TempConversor {

    public static String getCelsius(String strfar) { 
	String celsius;
	int cel;
	int far =Integer.valueOf(strfar);
	cel =  (int) Math.rint((far - 32)/1.8);
	celsius = String.valueOf(cel);
	return celsius;
	}
}
